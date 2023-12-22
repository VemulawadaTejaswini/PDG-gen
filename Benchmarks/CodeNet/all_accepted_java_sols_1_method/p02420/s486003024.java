import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String key = br.readLine();
			if(key.equals("-")) break;
			int n=Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++){
				int ch=Integer.parseInt(br.readLine());
				String tmpstr=key.substring(0,ch);
				key=key.substring(ch, key.length())+tmpstr;
			}
			System.out.println(key);
		}
	}
}