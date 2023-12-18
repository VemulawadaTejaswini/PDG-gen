import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		double a=0;
		int i=0;
		while(a<n) {
			i++;
			a=Math.floor((i)*1.08);
			
			
		}
		if(n==a) {
			System.out.println(i);
		}
		else {
			System.out.println(":(");
		}
		
	}
}