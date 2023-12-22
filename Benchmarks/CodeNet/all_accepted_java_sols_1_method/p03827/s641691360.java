import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		int x =0;
		int maxX=0;

		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='I') {
				x++;
				if(x>maxX) {
					maxX = x;
				}
			}else {
				x--;
			}
		}
		System.out.println(maxX);
	}

}
