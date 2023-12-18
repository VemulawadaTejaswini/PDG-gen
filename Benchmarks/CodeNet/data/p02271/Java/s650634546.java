import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		int i;
		for(i=0; i<n; i++){
			A[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int M[] = new int[q];
		int j;
		for(j=0; j<q; j++){
			M[j] = sc.nextInt();
		}

		int k, sum;
		for(j=0; j<q; j++){
			for(k=1; k<Math.pow(2, n); k++){
				sum=0;
				for(i=0; i<n; i++){
					if((k&1<<i)!=0) sum+=A[i];
				}
				if(M[j]==sum) break;
			}
			if(k<Math.pow(2, n)) System.out.println("yes");
			else                 System.out.println("no");
		}
	}
}