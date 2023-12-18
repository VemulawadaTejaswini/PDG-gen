import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String N = in.readLine();
		String W = in.readLine();
		String[] Wi = W.split(" ");

		int ans = 0 ;
		int min = 0;
		int left = 0;
		int right  = 0;

		int Li = 0;
		int Ri = Wi.length-1;

		while(Li <= Ri){
			if(left<right){
				left += Integer.parseInt(Wi[Li]);
				Li++;
			}else{
				right += Integer.parseInt(Wi[Ri]);
				Ri--;
			}
		}

		System.out.println(Math.abs(left - right));
	}
}
