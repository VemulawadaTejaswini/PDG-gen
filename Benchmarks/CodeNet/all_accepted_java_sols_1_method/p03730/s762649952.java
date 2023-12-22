import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		ArrayList<Integer> amari = new ArrayList<Integer>();

		int n = 1;
		while(true){
			int x = n*A%B;
			if(x==C){
				System.out.println("YES");
				break;
			}else{
				if(amari.contains(x)){
					System.out.println("NO");
					break;
				}else{
					amari.add(x);
				}
			}
			n++;
		}

	}

}
