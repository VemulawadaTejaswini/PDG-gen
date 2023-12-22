import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==5 || a==3 || a==7){
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}
}