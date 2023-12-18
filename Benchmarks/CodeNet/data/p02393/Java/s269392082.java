import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException
	{
		
		int tmp;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		if(a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}if(b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}if(a > b){
			tmp = a;
			a = b;
			b = tmp;
		}
		System.out.println(a +" "+ b +" "+ c);
	}		
}