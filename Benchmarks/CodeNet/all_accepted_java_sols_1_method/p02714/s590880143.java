import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		char[] A = new char[N];
		long ans = 0;
		for( int i=0; i<N; i++ ){
			A[i] = S.charAt(i);
		}
		long[] R = new long[N];
		long[] G = new long[N];
		long[] B = new long[N];
		long rr = 0,gg = 0,bb = 0;
		for( int i=N-1; i>=0; i-- ){
			if( A[i]=='R' ){
				rr++;
				R[i] = rr;
			}else{
				R[i] = rr;
			}
			if( A[i]=='G' ){
				gg++;
				G[i] = gg;
			}else{
				G[i] = gg;
			}
			if( A[i]=='B' ){
				bb++;
				B[i] = bb;
			}else{
				B[i] = bb;
			}
		}
		for( int i=0; i<N-2; i++ ){
			for( int j=i+1; j<N-1; j++ ){
				if( A[i]=='R' ){
					if( A[j]=='G' ){
if( j+(j-i)<N ){
						if( A[j+(j-i)]=='B' ){
							ans += B[j+1] - 1;
						}else{
							ans += B[j+1];
						}
}else{
	ans += B[j+1];
}
					}
					if( A[j]=='B' ){
if( j+(j-i)<N ){
						if( A[j+(j-i)]=='G' ){
							ans += G[j+1] - 1;
						}else{
							ans += G[j+1];
						}
}else{
	ans += G[j+1];
}						
					}
				}
				if( A[i]=='B' ){
					if( A[j]=='R' ){
if( j+(j-i)<N ){
						if( A[j+(j-i)]=='G' ){
							ans += G[j+1] - 1;
						}else{
							ans += G[j+1];
						}
}else{
	ans += G[j+1];
}
					}
					if( A[j]=='G' ){
if( j+(j-i)<N ){
						if( A[j+(j-i)]=='R' ){
							ans += R[j+1] - 1;
						}else{
							ans += R[j+1];
						}
}else{
	ans += R[j+1];
}						
					}
				}
				if( A[i]=='G' ){
					if( A[j]=='R' ){
if( j+(j-i)<N ){
						if( A[j+(j-i)]=='B' ){
							ans += B[j+1] - 1;
						}else{
							ans += B[j+1];
						}
}else{
	ans += B[j+1];
}
					}
					if( A[j]=='B' ){
if( j+(j-i)<N ){
						if( A[j+(j-i)]=='R' ){
							ans += R[j+1] - 1;
						}else{
							ans += R[j+1];
						}
}else{
	ans += R[j+1];
}						
					}
				}
			}
		}
		System.out.println(ans);
	}
}

