		import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		int x = sc.nextInt();
		while(x!=0){
			n++;
			System.out.println("Case "+n+": "+x);
			x = sc.nextInt();
		}
	}
}