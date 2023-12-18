
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer toks = new StringTokenizer(in.readLine());
		long a = Integer.parseInt(toks.nextToken());
		long b = Integer.parseInt(toks.nextToken());
		if(a<=0 && b>=0){
			System.out.println("Zero");
		}else if(a>0 && b>0){
			System.out.println("Positive");
		}else if(a<0 && b<0){
			if((Math.abs(b)-Math.abs(a))%2==0){
				System.out.println("Negative");
			}else{
				System.out.println("Positive");
			}
		}
//		out.println(res==0?"Zero":res>0?"Positive":"Negative");

		out.close();
	}
}
