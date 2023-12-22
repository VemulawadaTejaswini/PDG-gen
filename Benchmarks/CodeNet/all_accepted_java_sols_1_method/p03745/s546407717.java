import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] A = new int[n];
		int patern = 0;
		int count = 1;

		//格納
		for(int i=0; i<n; i++){
			A[i] = scan.nextInt();
		}

		for(int i=0; i<n-1; i++){
			if(patern==0){
				if(A[i]<A[i+1]){
					patern = 1;
				}
				else if(A[i]==A[i+1]){
					continue;
				}
				else if(A[i]>A[i+1]){
					patern = 2;
				}
			}
			else if(patern==1){
				if(A[i]<=A[i+1]){
					continue;
				}
				else{
					patern =0;
					count++;
				}
			}
			else if(patern==2){
				if(A[i]>=A[i+1]){
					continue;
				}
				else{
					patern = 0;
					count++;
				}
			}
		}
		System.out.println(count);
	}
}