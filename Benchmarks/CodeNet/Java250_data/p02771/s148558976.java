import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		Arrays.sort(Ws);

		String ans = "Yes";
		if(Ws[0].equals(Ws[1])){
			if(Ws[1].equals(Ws[2])){
				ans = "No";
			}
		}else if(Ws[2].equals(Ws[1])){

		}else{
			ans="No";
		}
		System.out.println(ans);

	}

}
