import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void  main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strArray[] = str.split(" ");
		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[1]);
		int c = Integer.parseInt(strArray[2]);
		StringBuffer out = new StringBuffer() ;
		out.append("No");
		if(a<b){
			if(b<c){
				out.replace(0,2,"Yes");
			}
		}
		System.out.println(out);
	}
}