import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		int a,b,c,p;

		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		String s = buf.readLine();
		String[] st=s.split(" ");

		a = Integer.parseInt(st[0]);
		b = Integer.parseInt(st[1]);
		c = Integer.parseInt(st[2]);

		if(a>b){
			p=a;
			a=b;
			b=p;
		}
		if(b>c){
			p=b;
			b=c;
			c=p;
		}
		if(a>b){
			p=a;
			a=b;
			b=p;
		}
		System.out.println(a+" "+b+" "+c);
	}

}