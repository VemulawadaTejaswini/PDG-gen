import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		int a,b,t;
		while(true){
			a = Integer.parseInt(st.nextToken().toString());
			b = Integer.parseInt(st.nextToken().toString());
			if (a>b) {
				t=a;a=b;b=t;
			} else if (a==0&&b==0){
				break;
			}
			System.out.println(a+" "+b);
			s = "";
			s = r.readLine();
			st = new StringTokenizer(s," ");
		}
	}
}