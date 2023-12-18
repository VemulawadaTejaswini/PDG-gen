import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=1; i<n; i++){
			a[i] = sc.nextInt();
		}
		int[] ans = new int[n+1];
		for(int i: a){
			ans[i]++; 
		}
		for(int i=1; i<ans.length; i++){
			System.out.println(ans[i]);
		}

	}
}
