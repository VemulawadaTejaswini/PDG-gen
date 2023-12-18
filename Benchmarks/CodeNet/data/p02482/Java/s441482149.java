import java.io.*;

public class Main {
	public void main(String[] args) throws IOException{
		int a,b;

		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		String s = buf.readLine();
		String[] st = s.split(" ");

		a = Integer.parseInt(st[0]);
		b = Integer.parseInt(st[1]);

		if(a<b){
			s = "a > b";
		}else if(a>b){
			s = "a < b";
		}else{
			s = "a == b";
		}

		System.out.println(s);
	}
}