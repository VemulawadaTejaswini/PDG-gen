import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] num = new int[n];
		int cnt = 0;
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			if(a[i]>n)cnt++;
			else num[a[i]-1]++;
		}
		for(int i=0; i<n; i++){
			if(num[i]<i+1)cnt += num[i];
			else if(num[i]>i+1)cnt += num[i]-i-1;
		}
		System.out.println(cnt);
	}
}