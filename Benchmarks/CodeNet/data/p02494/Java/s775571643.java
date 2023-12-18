import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] linearr;
		int i, j, h, w;
		try{
			while(null != (line=reader.readLine())){
				linearr = line.split(" ");
				h = Integer.parseInt(linearr[0]);
				w = Integer.parseInt(linearr[1]);
				if(h==0 && w==0){
					break;
				}
				for(i=0; i<h; i++){
					for(j=0; j<w; j++){
						System.out.printf("#");
					}
					System.out.printf("\n");
				}
				System.out.printf("\n");
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}