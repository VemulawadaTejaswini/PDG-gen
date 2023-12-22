//package abc043a;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			sum += i;
		}
		System.out.println(sum);
	}

}
