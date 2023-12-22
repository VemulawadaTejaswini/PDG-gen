import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		
		if(n%10==0 || n%10==1 ||n%10==6 || n%10==8) {
			System.out.println("pon");
		}else if(n%10==3) {
			System.out.println("bon");
		}else {
			System.out.println("hon");
		}
			
		}

	}

