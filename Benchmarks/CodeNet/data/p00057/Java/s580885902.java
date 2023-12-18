import java.util.Scanner;
public class Main {
	public static int f(int n) {
		int ans;
		ans=(n*n)+n+2;
		return ans/2;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		while(sc.hasNext()){
			n=sc.nextInt();
			System.out.println(f(n));
		}
	}
}