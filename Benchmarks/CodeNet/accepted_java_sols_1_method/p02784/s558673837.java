import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hp=sc.nextInt(),n=sc.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++)
			sum+=sc.nextInt();
		String can = sum>=hp?"Yes":"No";
		System.out.print(can);
	}
}
