import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		double B = sc.nextDouble();
		long C = (long)(B * 100);
		long ans = (A * C) / 100;
		System.out.println(ans);
	}
}