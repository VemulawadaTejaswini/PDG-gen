import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int min;
		if(N*A < B){
		    min = N*A;
		} else {
		    min = B;
		}
		System.out.println(min);
	}
}