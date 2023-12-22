import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		
		int[] npoints = new int[n];
		int[] a = new int[q];
		
		for(int i=0;i<n;i++){
    		npoints[i] = k-q;
		}
		
		for(int i=0;i<q;i++){
		    a[i] = sc.nextInt();
		    npoints[a[i]-1]++;
		}
		
		for(int i=0;i<n;i++){
		    if(npoints[i]>0){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
