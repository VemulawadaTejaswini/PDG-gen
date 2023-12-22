import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum=a+b;
		int dif=a-b;
		int pro=a*b;
		
		int max=sum;
		
		if(max<dif) {
			max=dif;
		}
		if(max<pro) {
			max=pro;
		}
		
		System.out.println(max);
		
		
	}
}
