import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0){
			int y=n%1000;
			int y2=y%100;
			int a=n/1000+y/100+y2/10+y2%10;
			System.out.println(a);
			n=sc.nextInt();
		}
	}
}