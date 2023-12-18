import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] num = str.split(" ", 0);
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		int c = Integer.parseInt(num[2]);

		if(a < b && b < c){
		 System.out.println("Yes");

		}else{
		 System.out.println("No");
		}
	}
}