import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int a,b,c;
		int i = 0;
		while(i < n){
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			if(a*a+b*b == c*c || b*b+c*c == a*a || c*c+a*a == b*b){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			i++;
		}
	}
}