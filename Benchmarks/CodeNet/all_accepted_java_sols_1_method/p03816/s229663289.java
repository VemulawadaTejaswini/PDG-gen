import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int ans=0;
		for(int i = 0; i<n; i++){
			int a = sc.nextInt();
			int idx=Collections.binarySearch(list,a);
			if(idx>=0){
				ans++;
			}else{
				list.add(-idx-1,a);
			}
		}
		if(ans%2==1){
			ans++;
		}
		System.out.println(n-ans);
	}
}
