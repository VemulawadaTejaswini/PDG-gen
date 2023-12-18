import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		for(int i=0; i<n; i++){
			s[i] = sc.nextInt();
		}
		int p = sc.nextInt();
		int[] q = new int[p];
		int ans = 0;
		for(int i=0; i<p; i++){
			int key = sc.nextInt();
			int upp = n-1;
			int low = 0;
			int mid = (upp+low)/2;
			while(low<upp){
				if(s[mid]==key){
					ans++;
					break;
				}
				else if(s[mid]>key){
					upp = mid;
					mid = (upp+low)/2;
				}
				else{
					low = mid;
					mid = (upp+low)/2;
				}
				if(upp-low==1 && s[upp]!=key && s[low]!=key){
					break;
				}
			}
		}
		System.out.println(ans);
	}
}	

