import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int a;	int b;	int c;	int d;	int e;
		int SUM;
		if(A % 10 == 0){
			a = 10;
		}
		else {
			a = A % 10;
		}
		if (B % 10 == 0){
			b = 10;
		}
		else {
			b = B % 10;
		}
		if (C % 10 == 0){
			c = 10;
		}
		else {
			c = C % 10;
		}
		if (D % 10 == 0){
			d = 10;
		}
		else {
			d = D % 10;
		}
		if (E % 10 == 0){
			e = 10;
		}
		else {
			e = E % 10;
		}
		int A2 = A + 10 - a;
		int B2 = B + 10 - b;
		int C2 = C + 10 - c;
		int D2 = D + 10 - d;
		int E2 = E + 10 - e;
		if(0 < a && a < b && a < c && a < d && a < e) {
			SUM = A + B2 + C2 + D2 + E2;
		}
		else if(0 < b && b < a && b < c && b < d && b < e) {
			SUM = A2 + B + C2 + D2 + E2;
		}
		else if(0 < c && c < b && c < a && c < d && c < e) {
			SUM = A2 + B2 + C + D2 + E2;
		}
		else if(0 < d && d < b && d < c && d < a && d < e) {
			SUM = A2 + B2 + C2 + D + E2;
		}
		else {
			SUM = A2 + B2 + C2 + D2 + E;
		}
		System.out.print(SUM);
	}
}