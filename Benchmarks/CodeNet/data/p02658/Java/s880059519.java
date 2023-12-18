import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		long ans = 1;
		
		for(int i=0; i<n; i++){
		    if(ans/1000000000 < 1000000000){
		        a[i]=sc.nextInt();
		        ans = ans*a[i];
		    }else{
		        ans = -1;
		    }
		}
		
		System.out.println(ans);
	}
}
