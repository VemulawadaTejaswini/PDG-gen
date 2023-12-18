import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];
		int cnt1[] = new int[100001];
		int cnt2[] = new int[100001];
		
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}

		for(int i=0;i<n;i+=2){
			cnt1[a[i]]++;
			cnt2[a[i+1]]++;				
		}

		int max1=0, max2=0;
		for(int i=0;i<100001;i++){
			if(cnt1[i] >= cnt1[max1])
				max1 = i;
			if(cnt2[i] >= cnt2[max2])
				max2 = i;
		}

		if(max1 == max2){
			int t1 = 0, t2=0;
			for(int i=0;i<100001;i++){
				if(cnt1[i] >= cnt1[t1] && i != max2)
					t1 = i;
				if(cnt2[i] >= cnt2[t2] && i != max1)
					t2 = i;
			}
			
			System.out.println(Math.min((n/2-cnt1[max1]) + (n/2-cnt2[t2]), 
				(n/2-cnt1[t1]) + (n/2-cnt2[max2])));
		}
		else{
			System.out.print((n/2-cnt1[max1]) + (n/2-cnt2[max2]));
		}
	}
}