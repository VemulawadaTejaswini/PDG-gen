import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//Scanner sa = new Scanner(System.in);
		int b = sc.nextInt();
		int x=0;

		for(int i=0;i<2;i++){
			if(a >= b){
				x +=a;
				a = a-1;
			}else {
				x +=b;
				b = b-1;
			}
		}
		System.out.println(x);
	}
}
