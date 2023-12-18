import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		
		String a = vd.readLine().split("")[0];
		String b = vd.readLine().split("")[1];
		String c = vd.readLine().split("")[2];
		
		System.out.println(a+b+c);
		
	}

}
