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

				for(int i=0; i<h; i++){
					for(int j=0; j<w; j++){
						System.out.print("#");
					}
					System.out.println("");
				}
				System.out.println(""); //空行
			}

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}