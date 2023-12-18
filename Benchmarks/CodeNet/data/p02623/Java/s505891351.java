import java.math.BigInteger;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		long A[]=new long[n];
		long B[]=new long[m];
		long dpA[]=new long[n+1];
		long dpB[]=new long[m+1];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextLong();
			//dpA[i]=dpA[i-1]+A[i];
		}
		for(int i=0;i<m;i++) {
			B[i]=sc.nextLong();
			//dpB[i]=dpB[i-1]+B[i];
		}
		for(int i=n-1;i>0;i--) {
			dpA[i]=dpA[i+1]+A[i];
		}
		for(int i=m-1;i>0;i--) {
			dpB[i]=dpB[i+1]+B[i];
		}
		//System.out.println(Arrays.toString(A));
		//System.out.println(Arrays.toString(B));
		
		
		//System.out.println(Arrays.toString(dpA));
		//System.out.println(Arrays.toString(dpB));
		int count=0;
		int i=0;
		int j=0;
		//System.out.println("K= "+k);
		while(k>0) {
			if(i>=n) {
				k-=B[j];
				j++;
				if(k>=0) {
					count++;
				}else {
					break;
				}
				
			}else if(j>=m) {
				k-=A[i];
				i++;
				if(k>=0) {
					count++;
				}else {
					break;
				}
			}else {
				if(k-A[i]>=0&&k-B[j]>=0) {
					if(dpA[i+1]<=dpB[j+1]) {
						k-=A[i];
						count++;
						i++;
					}else {
						k-=B[j];
						count++;
						j++;
					}
				}else if(k-A[i]>=0&&k-B[j]<0) {
					k-=A[i];
					count++;
					i++;
				}else if(k-B[j]>=0&&k-A[i]<0) {
					k-=B[j];
					count++;
					j++;
				}else {
					break;
				}
			}
			//System.out.println("k= "+k);
		}
		System.out.println(count);
		
		
		
	}
	
	
}

 
