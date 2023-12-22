import java.util.*;
public class Main {
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int odd=(n+1)/2;
		double ans=(double)odd/n;
		System.out.println(ans);
    }
}