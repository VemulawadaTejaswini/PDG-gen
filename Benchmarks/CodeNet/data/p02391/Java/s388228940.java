import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] strAry=str.split(" ");
		int a=Integer.parseInt(strAry[0]);
		int b=Integer.parseInt(strAry[1]);
		String ans;
		if(a>b)ans="a > b";
		else if(a < b)ans="a < b";
		else ans="a == b";
		System.out.println(ans);
	}
}