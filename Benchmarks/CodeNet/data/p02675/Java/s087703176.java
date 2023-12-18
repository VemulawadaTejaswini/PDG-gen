import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		if(n==2||n==4||n==5||n==7||n==9) 
		{System.out.println("hon");
			
		}else if (n==0||n==1||n==6||n==8) {
			System.out.println("pon");
		}else {
			System.out.println("bon");
		}
	}

}