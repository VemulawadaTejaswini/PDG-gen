import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		if(n<10) {//1~10
			sum=n;
		}else if(n<100){//10~100
			sum=9;
		}else if(n<1000){//100~1000
			sum=n-90;
		}else if(n<10000) {//1000~10000
			sum=909;
		}else if(n<100000){//10000~100000
			sum=n-9090;
		}else {
			sum=90909;
		}
		System.out.println(sum);
	}

}
