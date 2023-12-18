import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		int[] ans = new int[n];
		for(int i=n-1; 0<=i; i--){
			int total = 0;
			int count = 2;
			int j = (i+1)*count;
			while(j<=ans.length){
				total += ans[j-1];
				count++;
				j = (i+1)*count;
			}
			if(total%2 == 0){
				if(a[i] == 0) ans[i] = 0;
				else ans[i] = 1;
			} else {
				if(a[i] == 0) ans[i] = 1;
				else ans[i] = 0;
			}
		}
		int ansC = 0;
		List<Integer> ansA = new ArrayList<>();
		for(int i=0; i<ans.length; i++){
			if(ans[i] == 1) {
				ansC++;
				ansA.add(i);
			}
		}
		System.out.println(ansC);
		for(int i: ansA){
			System.out.print((i+1)+" ");
		}

	}
}
