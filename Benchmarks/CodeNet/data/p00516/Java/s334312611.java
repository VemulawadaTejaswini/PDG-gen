import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,k,n,m,max,idx = 0;
		n = sc.nextInt();
		m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int[] vote = new int[n];
		for(i = 0; i < n; i ++ ){
			a[i] = sc.nextInt();
			vote[i] = 0;
		}
		max = vote[0];
		for(k = 0; k < m; k ++ )b[k] = sc.nextInt();
		for(k = 0; k < m; k ++ ){
			for(i = 0; i < n; i ++ ){
				if(b[k] >= a[i]){
					vote[i] ++;
					break;
				}
			}
		}
		for(i = 0; i < n; i ++ ){
			if(max < vote[i]){
				max = vote[i];
				idx = i+1;
			}
		}
		System.out.println(idx);
		
	}

}