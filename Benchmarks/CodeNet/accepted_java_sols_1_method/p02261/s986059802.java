import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String C[] = new String[N];
		char B[] = new char[N];
		int A[] = new int[N];
		char wc;
		int i, j, min, wi, flg=0;
		for(i=0; i<N; i++){
			C[i] = sc.next();
		}

		for(i=0; i<N; i++){
			B[i] = C[i].charAt(0);
			A[i] = Integer.parseInt("" + C[i].charAt(1));
		}
		for(i=0; i<N-1; i++){
			for(j=N-1; j>=i+1; j--){
				if(A[j]<A[j-1]){
					wc     = B[j];
					B[j]   = B[j-1];
					B[j-1] = wc;
					wi     = A[j];
					A[j]   = A[j-1];
					A[j-1] = wi;
				}
			}
		}
		for(i=0; i<N; i++){
			if(i!=0) System.out.print(" ");
			System.out.print(""+B[i]+A[i]);
		}
		System.out.println();
		System.out.println("Stable");

		for(i=0; i<N; i++){
			B[i] = C[i].charAt(0);
			A[i] = Integer.parseInt("" + C[i].charAt(1));
		}
		for(i=0; i<N-1; i++){
			min = i;
			for(j=i+1; j<N; j++){
				if(A[min]>A[j]) min = j;
			}
			if(min!=i){
				for(j=i+1; j<min; j++){
					if(A[i]==A[j]){
						flg = 1;
						break;
					}
				}
				wc     = B[i];
				B[i]   = B[min];
				B[min] = wc;
				wi     = A[i];
				A[i]   = A[min];
				A[min] = wi;
			}
		}
		for(i=0; i<N; i++){
			if(i!=0) System.out.print(" ");
			System.out.print(""+B[i]+A[i]);
		}
		System.out.println();
		if(flg==0) System.out.println("Stable");
		else       System.out.println("Not stable");
	}
}