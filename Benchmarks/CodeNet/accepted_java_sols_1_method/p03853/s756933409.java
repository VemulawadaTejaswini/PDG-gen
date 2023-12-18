import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		String[] c = new String[h];
		for(int i =0;i<h;i++) {
			c[i]=scan.next();
		}
		String[] c2 = new String[h*2];
		for (int i=0,m=0;i<h*2;i=i+2,m++) {
			c2[i]=c[m];
			c2[i+1]=c[m];
		}
		for(int i =0;i<h*2;i++) {
			System.out.println(c2[i]);
		}
	}

}
