import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cnt5 = 0;
		int cnt7 = 0;
		if(a==5){
			cnt5 += 1;
		}else if(a==7){
			cnt7 += 1;
		}
		if(b==5){
			cnt5 += 1;
		}else if(b==7){
			cnt7 += 1;
		}
		if(c==5){
			cnt5 += 1;
		}else if(c==7){
			cnt7 += 1;
		}

		sc.close();
		System.out.println((cnt5==2&&cnt7==1) ? "YES":"NO");
	}
}