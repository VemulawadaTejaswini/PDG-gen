import java.util.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int money = 100;
		for(int i=0;i<n;i++)
			money=(int) Math.ceil(money*1.05);	
		System.out.println(money*1000);
	}
}