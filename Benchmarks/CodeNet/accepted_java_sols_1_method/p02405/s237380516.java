import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = reader.readLine();
			String[] sarray = line.split(" ", -1);
			int H = Integer.parseInt(sarray[0]);
			int W = Integer.parseInt(sarray[1]);
			int n = 0;
			if(H == 0 && W == 0){
				break;
			} else {
				for(int i = 0; i < H; i++){
					if(i % 2 == 0){
						for(int j = 0; j < W; j++){
							if(j % 2 == 0){
								System.out.print("#");
							} else {
								System.out.print(".");
							}
						}
					} else {
						for(int j = 0; j < W; j++){
							if(j % 2 == 1){
								System.out.print("#");
							} else {
								System.out.print(".");
							}
						}
					}
					System.out.println();
				}
				System.out.println();
			}
		}
	}
}