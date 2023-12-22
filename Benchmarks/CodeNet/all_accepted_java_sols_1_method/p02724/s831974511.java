import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;
		sum += x/500*1000;
		sum  +=(x%500)/5*5;
		System.out.print(sum);
	}
}