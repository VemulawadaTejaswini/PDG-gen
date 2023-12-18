
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			String[] strs = (String[])br.readLine().split(" ");
			int num1 = Integer.parseInt(strs[0]);
			int num2 = Integer.parseInt(strs[1]);

			if(num1<num2){
				System.out.println("a < b");
			}else if(num1>num2){
				System.out.println("a > b");
			}else{
				System.out.println("a == b");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}