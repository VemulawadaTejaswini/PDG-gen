import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = null;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			String buf;
			while((buf = br.readLine())!=null){
				int JOI =0,IOI=0;
				for(int i = 0; i < buf.length() -2;i++){
					String data = buf.substring(i, i+3);
					if(data.equals("JOI"))JOI++;
					if(data.equals("IOI"))IOI++;
				}
				System.out.println(JOI);
				System.out.println(IOI);
			}
		}finally{
			if(!(br == null))br.close();
		}
	}
}