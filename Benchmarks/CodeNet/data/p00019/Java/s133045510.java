import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		long n = stdIn.nextLong();
		long prd=1;
		
		while(n != 0)
			prd *= n--;
		
		System.out.println(prd);
	}

}