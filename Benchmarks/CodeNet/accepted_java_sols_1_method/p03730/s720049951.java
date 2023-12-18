import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		//List<Integer> amari = new ArrayList<Integer>();
		for(int i=1;;i++) {
			if((a*i)%b==c) {
				System.out.println("YES");
				break;
			}else {
				if((a*i)%b <=0) {
					System.out.println("NO");
					break;
				}

			}
		}
	}

}
