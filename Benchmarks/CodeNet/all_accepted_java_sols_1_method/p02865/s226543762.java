import java.util.Scanner;

public class Main{
	public static void main(String[]orgs){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
		int a = 1;
		int b = n-1;
		int count = 0;
		while(a<b){
			a++;
			b= n-a;
			count++;
		}
		System.out.println(count);
	}
}
