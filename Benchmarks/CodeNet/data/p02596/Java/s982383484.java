import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int seven = 7;
		int num = seven;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		
		while(!(K==2)) {
			count++;
			if(num%K==0) {
				break;
			}
			num = (num*10)+seven;
		}
		
		if(K==2) {
			System.out.println("-1");
		}else {
			System.out.println(count);
		}
		
	}

}