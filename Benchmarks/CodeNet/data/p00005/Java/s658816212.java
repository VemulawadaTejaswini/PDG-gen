import java.util.Scanner;

class Main {
	public static void main(String a[]){
		Scanner scanner = new Scanner(System.in);
		int n1;
		int n2;
		while(scanner.hasNext()){

			n1 = scanner.nextInt();
			n2 = scanner.nextInt();

			System.out.println(gcd(n1,n2) + " " + lcm(n1,n2));
		}
		scanner.close();
	}

	public static int gcd(int a, int b ){
		if(b>a){
			int k = a;
			a = b;
			b = k;
		}
		while(a%b != 0){
			int t = a%b;
			a = b;
			b = t;
		}
		return b;
	}
	

	public static long lcm(int a, int  b){
		return a/gcd(a,b) * b;
	}

}

