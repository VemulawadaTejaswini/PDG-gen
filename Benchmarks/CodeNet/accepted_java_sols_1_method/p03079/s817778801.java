import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int n = sc.nextInt();
		//int s = 0;
		//int end =  0;
		int n = 3;
		int na[] = new int[n];
		int a, b, c;
		for (int i = 0; i < n; i++)
		{
			na[i] = sc.nextInt();
		}
		if(na[0] >= na[1] && na[0] >= na[2])
		{
			a= na[0];
			b= na[1];
			c= na[2];
		}
		else if (na[1] >= na[0] && na[1] >= na[2])
		{
			a= na[1];
			b= na[0];
			c= na[2];
		}
		else
		{
			a= na[2];
			b= na[1];
			c= na[0];
		}
		if(a == b && b ==  c)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}