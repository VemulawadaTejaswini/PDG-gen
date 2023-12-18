import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int s = a; //????°????
		int b = a; //?????§???
		long num = a; //????¨????
		for (int i=1; i<n; i++) {
			a = sc.nextInt();
			num += a;
			if(s>a){
				s = a;
			}else if(b<a){
				b = a;
			}
		}
		System.out.println(s + " " + b + " " + num);
	}
}