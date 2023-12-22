import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int X=scan.nextInt();
		int Y=scan.nextInt();
	
		int turu=0;
		int kame=0;
		for(int i=0;i<=Y/2;i++) {
			int a=0;
			a=Y-(i*2);
			if(a%4==0&&(i+a/4)==X) {
		      turu=i;  kame=a/4;
		      break;
		      
			}
		}
		if(turu==0&&kame==0) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		
	}
}
