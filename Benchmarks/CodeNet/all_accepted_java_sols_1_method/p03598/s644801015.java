import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		int min = 0;
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			if(x[i]>k-x[i]){
				min += 2*(k-x[i]);
			}
			else{
				min += 2*x[i];
			}
		}
		System.out.println(min);
	}
}