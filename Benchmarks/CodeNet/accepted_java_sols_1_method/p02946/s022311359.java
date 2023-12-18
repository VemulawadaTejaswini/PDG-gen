import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		
		int min=x-(k-1);
		int max=x+(k-1);
		
		for(int i=min;i<max+1;i++) {
			System.out.print(i);
			System.out.print(" ");
		}
	
		
		
	}
}
