import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static int[]sizes = new int[]{60, 80, 100, 120, 140, 160};
	public static int[] weights = new int[]{2, 5, 10, 15, 20, 25};
	public static int[] fees = new int[]{600, 800, 1000, 1200, 1400, 1600};
	
	public Main() throws IOException{	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null){
			int size = Integer.parseInt(line);
			if(size==0) break;
			int sum = 0;
			for(int n=0; n<size; n++){
				line = in.readLine();
				String tmp[] = line.split(" ");
				int x = Integer.parseInt(tmp[0]);
				int y = Integer.parseInt(tmp[1]);
				int h = Integer.parseInt(tmp[2]);
				int w = Integer.parseInt(tmp[3]);
				int s = x + y + h;
				for(int i=0; i<6; i++){
					if(s <= sizes[i] && w <= weights[i]){
						sum += fees[i];
						break;
					}
				}
			}
			
			System.out.println(sum);
		}
	}
}