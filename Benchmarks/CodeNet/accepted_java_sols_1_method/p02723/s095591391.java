import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		String a=scan.next();
			if(a.charAt(2)==a.charAt(3)&&a.charAt(4)==a.charAt(5)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}