import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int count=0;
		if(a%10==2) {
			count++;
		}
		a/=10;
		if(a%10==2) {
			count++;
		}
		a/=10;
		if(a%10==2) {
			count++;
		}
		a/=10;
		if(a%10==2) {
			count++;
		}
		System.out.println(count);
		}
}