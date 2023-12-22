import java.io.*;

public class Main{
	public static void main(String[] arsg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		while(true){
			String str = br.readLine();
			if(str.equals("-")) break;
			int n = Integer.parseInt(br.readLine());
			for(int i = 0;i<n;i++){
				int h = Integer.parseInt(br.readLine());
				str = str.substring(h, str.length()) + str.substring(0,h);
			}
			System.out.println(str);
		}
	}
}