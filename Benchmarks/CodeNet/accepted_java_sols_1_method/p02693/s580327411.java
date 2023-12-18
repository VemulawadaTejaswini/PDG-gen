import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = 0;
		if(c-b > a) d = 1;
		else {
			for(int i = 0; i<(c-b)+1; i++) {
				if((b+i) % a == 0) d = 1;
			}
		}
		if(d == 0) System.out.println("NG");
		else System.out.println("OK");
	}
}