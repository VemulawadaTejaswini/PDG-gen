import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int a = sc.nextInt();
			double h = sc.nextDouble()/100;
			double w = sc.nextDouble();
			double b = Math.abs(22-(w/(h*h)));
			for(int i=1;i<n;i++){
				int x = sc.nextInt();
				h = sc.nextDouble()/100;
				w = sc.nextDouble();
				double a = Math.abs(22-(w/(h*h)));
				if(a<b){
					b = a;
					a = x;
				}
				else if(a==b&&x<a)a = x;
			}
			System.out.println(a);
		}
	}
}