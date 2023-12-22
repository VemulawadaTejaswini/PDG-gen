import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader cd = new BufferedReader(new InputStreamReader(System.in));
		String vd = cd.readLine();
		int ans =0;
		for(int i=0;i<vd.length();++i) {
			if(vd.charAt(i)=='+') ans++;
			if(vd.charAt(i)=='-') ans--;
		}
		System.out.println(ans);
	}

}
