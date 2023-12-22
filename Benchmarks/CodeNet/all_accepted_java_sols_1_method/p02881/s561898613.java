import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		long num = Long.parseLong(W);
		long ans =Long.MAX_VALUE;
		for(long i = 1;i*i<=num;i++){
			if(num%i==0){
				ans = Math.min(ans, (i+num/i)-2);
			}
        }

		System.out.println(ans);

	}


}
