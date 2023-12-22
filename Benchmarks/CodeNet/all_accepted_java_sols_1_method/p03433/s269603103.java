import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();

		int t = N%500;
		if(t<=A) System.out.println("Yes");
		else System.out.println("No");
	}
}