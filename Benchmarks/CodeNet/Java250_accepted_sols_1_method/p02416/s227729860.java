import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x=br.readLine();
		while(!x.equals("0")) {
			//文字列をカウント
			int n=x.length();
			//繰り返し
			int sum=0;
			for(int i=0;i<n;i++) {
				//strからi個目の文字を切り出す
				char a;
				a=x.charAt(i);
				int b=Integer.parseInt(String.valueOf(a));
				sum+=+b;
			}
			System.out.println(sum);
			x=br.readLine();
		}
	}

}

