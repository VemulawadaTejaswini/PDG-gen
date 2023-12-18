import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		int[] x=new int[n];
		
		for(int i=0;i<n;i++){
			int t = sc.nextInt();
			sum = sum^t;
			x[i] = t;
		}
		
		for(int i=0;i<n;i++){
			System.out.println(sum^x[i]);
		}
	}
}