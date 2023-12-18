import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp = n;
		int f = 0;
		
		while(temp != 0){
			int rem = temp % 10;
			temp /=10;
			f += rem; 
		}

		if(n % f == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
