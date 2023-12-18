import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] c = new int[n];
		int[] l = new int[q];
		int[] r = new int[q];
		for(int i=0;i<n;i++){
			c[i] = sc.nextInt();
		}
		for(int i=0;i<q;i++){
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		for(int i=0;i<q;i++){
			int count = 0;
			int[]tmp = new int[n];
			for(int j=l[i]-1;j<r[i];j++){
				tmp[c[j]]++;
			}
			for(int j=0;j<n;j++){
				if( tmp[j] > 0 ){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}