import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int p = sc.nextInt();
		
		int all = 3 * a + p;
		boolean odd = true;
		
		odd = (all % 2 == 1);
		
		if(odd) {
			System.out.println((all-1)/2);
		}
		else {
			System.out.println(all/2);
		}

	}

}
