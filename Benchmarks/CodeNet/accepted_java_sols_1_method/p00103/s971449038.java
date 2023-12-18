import java.io.*;


public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		int out_count = 0;
		int ining = 0;
		int data_size = 0;
		int point = 0;
		int[] scores;
		int[] base = new int[]{0, 0, 0};
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String line;
		data_size = Integer.parseInt(in.readLine());
		scores = new int[data_size];

		while((line = in.readLine()) != null){
			if(line.equals("OUT")){
				out_count++;

				if(out_count == 3){
					scores[ining] = point;
					point = 0;
					ining++;
					out_count = 0;
					base = new int[]{0, 0, 0};
				}
			}
			else if(line.equals("HIT")){
				for(int i=0; i<3; i++){
					if(base[i] != 1){
						base[i] = 1;
						break;
					}

					if(i==2){
						point++;
					}
				}
			}
			else if(line.equals("HOMERUN")){
				int count = 0;
				for(int i=0; i<3; i++){
					if(base[i] == 1){
						count++;
					}
				}

				point += count+1;
				base = new int[]{0, 0, 0};
			}

			if(ining == data_size){
				break;
			}
		}

		for(int i=0; i<data_size; i++){
			System.out.println(scores[i]);
		}
	}
}