import java.util.Scanner;

class Main {
	public static void main(String args[]){
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		if ((b-a<=d && a-b<=d && c-b<=d && b-c<=d) || (c-a<=d && a-c<=d)){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
		
		return;
	}
}