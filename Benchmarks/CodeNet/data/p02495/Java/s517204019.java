import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] linearr;
		int i, j, h, w;
		int f = 1;
		try{
			while(null != (line=reader.readLine())){
				linearr = line.split(" ");
				h = Integer.parseInt(linearr[0]);
				w = Integer.parseInt(linearr[1]);
				if(h==0 && w==0){
					break;
				}
				for(i=0; i<h; i++){
					f = (i%2==0)?1:-1;
					for(j=0; j<w; j++){
						if(f==1)System.out.printf("#");
						else if(f==-1)System.out.printf(".");
						f*=-1;
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