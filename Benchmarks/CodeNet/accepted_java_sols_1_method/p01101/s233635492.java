import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0){
				return;
			}
			int[] a = new int[n];
			for(int i = 0;i < n;i++){
				a[i] = sc.nextInt();
			}
			int max = 0;
			Arrays.sort(a);
			if(a[0] + a[1] > m){
				System.out.println("NONE");
				continue;
			}
			for(int i = 0;i < n;i++){
				for(int j = i+1;j < n;j++){
					if(a[i] + a[j] > m){
						continue;
					}
					max = Math.max(max,a[i] + a[j]);
				}
			}
			System.out.println(max);
		}
	}
}

