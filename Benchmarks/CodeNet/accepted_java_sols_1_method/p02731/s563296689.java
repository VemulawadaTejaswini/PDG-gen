import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		double ans = (L/3.0)*(L/3.0)*(L/3.0);
		System.out.println(String.format("%.7f", ans));
    }
}
