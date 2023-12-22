import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s=" ";
		StringTokenizer st;
		int a,b,gcd,lcm,t,m,n;
		try {
			for(;s!=null;){
				s = r.readLine();
				st = new StringTokenizer(s," ");
				a = Integer.parseInt(st.nextToken().toString());
				b = Integer.parseInt(st.nextToken().toString());
				if(b>a){
					t=b; b=a; a=t;
				}
				m=a;n=b;
				while(true){
					if(n==0){
						gcd=m;
						break;
					}
					t=n;
					n=m%n;
					m=t;
				}
				lcm=(a/gcd)*b;
				System.out.println(gcd+" "+lcm);
			}
		} catch (Exception err) {
			System.exit(0);
		}
	}
}