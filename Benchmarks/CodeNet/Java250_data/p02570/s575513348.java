
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line[] = sc.nextLine().split(" ");
		
		int d = Integer.parseInt(line[0]);
		int t = Integer.parseInt(line[1]);
		int s = Integer.parseInt(line[2]);

				
		if(t * s >=d) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}

}
