import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer a[]=new Integer[n];
		int b[]=new int[n];
		int ans=0;
		List<Integer> memo=new ArrayList<Integer>();
		for (int i=0;i<n;i++) {
			a[i]=Integer.valueOf(sc.nextInt());
		}
		 Arrays.sort(a, Collections.reverseOrder());
		 for (int i=0;i<n;i++) {
			 b[i]=a[i].intValue();
		 }
		 for (int i=0;i<n;i++){
			 for (int j=i+1;j<n;j++){
				 if (a[i]==a[j]) {
					 memo.add(a[i]);
				 }
			 }
		 }
		 for  (int i=0;i<n;i++) {
			 int count=0;
			 if (memo.contains(a[i])) {
				 continue;
			 }
			 for (int j=i+1;j<n;j++) {
				 if(a[i]%a[j]==0) {
					count=-100;
					break;
				 }
				 else {
					 count+=1;
				 }
			 }
			 if(count==n-i-1) {
				 ans+=1;
			 }
		 }
		 System.out.println(ans);
	}
}
