import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[m];
		for(int i=0; i<m; i++){
			a[i] = sc.nextInt();
		}
		int num1 = 0;
		int num2 = 0;
		for(int i=0; a[i]<x; i++){
			if(a[i]<x)num1++;
		}
		num2 = m - num1;
		System.out.print(Math.min(num1,num2));
	}
}