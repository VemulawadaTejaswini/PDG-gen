import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		if(n<10) {
			i=n;
		}else if(n<100) {
			i=9;
		}else if(n<1000) {
			i=10+n-100;
		}else if(n<10000) {
			i=909;
		}else if(n<100000) {
			i=910+n-10000;
		}else {
			i=90909;
		}
		System.out.print(i);
	}

}
