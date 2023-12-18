import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long q = sc.nextInt();
		long h = sc.nextInt();
		long s = sc.nextInt();
		long d = sc.nextInt();
		long n = sc.nextInt();
		sc.close();
		long sum = 0;
		if(d/2<=s && d/2<=2*h && d/2<=4*q) {
			sum += n/2*d;
			if(n%2==1) {
				if(s<=2*h && s<=4*q) {
					sum += s;
				} else if(2*h<=s && h<=2*q) {
					sum += 2*h;
				} else {
					sum += 4*q;
				}
			}
		} else if(s<=2*h && s<=4*q) {
			sum += n*s;
		} else if(h<=2*q) {
			sum += 2*n*h;
		} else {
			sum += 4*n*q;
		}
		System.out.println(sum);
	}

}