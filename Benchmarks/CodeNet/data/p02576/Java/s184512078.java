import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int chkNum=0;
		
		while(n>0) {
			chkNum = chkNum + n%10;
			n = n/10;
		}
		if(chkNum%9 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}