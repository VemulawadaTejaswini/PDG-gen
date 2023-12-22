import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String str;
			while((str=br.readLine())!=null){
				int h = Integer.parseInt(str.substring(0,str.indexOf(" ")));
				int w = Integer.parseInt(str.substring(str.indexOf(" ")+1));
				if(h==0 && w==0){ break; }

				for(int i=0; i<w; i++){
					System.out.print("#");
				}
				System.out.println("");

				for(int i=0; i<h-2; i++){
					System.out.print("#");

					for(int j=0; j<w-2; j++){
						System.out.print(".");
					}

					System.out.println("#");
				}

				for(int i=0; i<w; i++){
					System.out.print("#");
				}
				System.out.println("");
				System.out.println("");

			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}