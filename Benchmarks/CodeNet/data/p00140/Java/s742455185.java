import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while((line = in.readLine()) != null){
			int size = Integer.parseInt(line);
			for(int n=0; n<size; n++){
				line = in.readLine();
				String[] tmp = line.split(" ");
				int s = Integer.parseInt(tmp[0]);
				int g = Integer.parseInt(tmp[1]);
				if(s <=5 && g <= 5 && s<=g){
					for(int i=s; i<=g; i++){
						System.out.print(i);
						if(i!=g){
							System.out.print("->");
						}
					}
					System.out.println();
				}
				else if(s <=5 && g <= 5 && s>g){
					for(int i=s; i>=g; i--){
						System.out.print(i);
						if(i!=g){
							System.out.print("->");
						}
					}
					System.out.println();
				}
				else if(s<=5 && g>5){
					for(int i=s; i<=g; i++){
						System.out.print(i);
						if(i!=g){
							System.out.print("->");
						}
					}
					System.out.println();
				}
				else if(s>5 && g<=5){
					for(int i=s; i<=9; i++){
						System.out.printf("%d->", i);
					}

					for(int i=5; i>=g; i--){
						System.out.print(i);
						if(i!=g){
							System.out.print("->");
						}
					}
					System.out.println();
				}
				else if(s>5 && g>5 && s<=g){
					for(int i=s; i<=g; i++){
						System.out.print(i);
						if(i!=g){
							System.out.print("->");
						}
					}
					System.out.println();
				}
				else if(s>5 && g>5 && s>g){
					for(int i=s; i<=9; i++){
						System.out.printf("%d->", i);
					}

					for(int i=5; i>=g; i--){
						System.out.print(i);
						if(i!=g){
							System.out.print("->");
						}
					}
					System.out.println();
				}
			}
		}
	}
}