import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int a=Integer.parseInt(str[0]);
		int b=Integer.parseInt(str[1]);
		int w;

		while(br!=null){
	        StringBuilder out=new StringBuilder();
			w=a+b;
			out.append(w);
			w=out.length();
			System.out.println(w);
		
			str=br.readLine().split(" ");
			a=Integer.parseInt(str[0]);
			b=Integer.parseInt(str[1]);
		}
		System.out.print("\n");
	}

}