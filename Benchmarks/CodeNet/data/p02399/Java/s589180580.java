import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str;
			String[] arr;
			int a,b,c,d,r;
			float f;
			while((str=br.readLine())!=null){
				arr=str.split(" ");
				a=Integer.parseInt(arr[0]);
				b=Integer.parseInt(arr[1]);
				d = a/b;
				r = a%b;
				f = (float)a/b;
				System.out.printf("%d %d %.5f\n",d,r,f);
				break;
			}

			br.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}