
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		for(int i=0;i<str.length();i++){
			String ans=str.substring(i, i+1);
			if(ans.equals(ans.toLowerCase())) ans=ans.toUpperCase();
			else if(ans.equals(ans.toUpperCase())) ans=ans.toLowerCase();
			System.out.print(ans);
		}
		System.out.println("");
	}
}