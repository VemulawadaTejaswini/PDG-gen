import java.util.*;

public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int b=sc.nextInt();
		int sum = 0;
		for(int i=0;i<b;i++)
			sum+=sc.nextInt();
		if(sum >= h)
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
}