import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int x = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int choco = 0;
		for(int i=0;i<n;i++) {
			choco =choco+ d/a[i];
			if(d%a[i]!=0) {
				choco++;
			}
		}
		System.out.println(x+choco);
	}

}
