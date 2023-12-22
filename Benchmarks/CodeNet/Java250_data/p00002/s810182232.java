import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b,w;
		String str;
		String[] s;
		str=br.readLine();
		while(str !=null){
			StringBuilder out=new StringBuilder();
			s=str.split(" ");
			a=Integer.parseInt(s[0]);
			b=Integer.parseInt(s[1]);
			w=a+b;
			out.append(w);
			System.out.println(out.length());
			str=br.readLine();
		}
	}
}