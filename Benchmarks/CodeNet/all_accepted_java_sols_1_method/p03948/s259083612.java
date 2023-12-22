import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), t = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int maxd = 0;
		int cnt = 1;
		int sufmax[] = new int[n];
		sufmax[n-1] = a[n-1];
		for(int i=n-2;i>=0;i--){
			sufmax[i] = Math.max(a[i], sufmax[i+1]);
		}
		
		for(int i=0;i<n-1;i++){
			if(sufmax[i+1] - a[i] > maxd){
				maxd = sufmax[i+1] - a[i];
				cnt = 1;
			}
			else if(sufmax[i+1] - a[i] == maxd){
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
