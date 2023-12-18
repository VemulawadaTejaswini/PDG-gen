import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] m= new int[n];
		for(int i=0; i<n;i++){
			m[i]=sc.nextInt();
		}
		Arrays.sort(m);
		for(int i=0;i<n-1;i++){
			System.out.print(m[i]+" ");
		}
		System.out.println(m[n-1]);
		}
}