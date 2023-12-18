import java.util.Scanner;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num = n;
		while(n > 1){
			n--;
			num *= n;
		}
		System.out.println(num);
	}
}