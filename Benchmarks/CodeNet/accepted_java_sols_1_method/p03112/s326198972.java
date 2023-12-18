import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A  = sc.nextInt();
		int B  = sc.nextInt();
		int Q  = sc.nextInt();

		Long[] AA = new Long[A+2];
		Long[] BB = new Long[B+2];
		Long[] QQ = new Long[Q+2];

		for(int i = 1 ; i <= A ; i++){
			AA[i] = sc.nextLong();
		}
		for(int i = 1 ; i <= B ; i++){
			BB[i] = sc.nextLong();
		}
		for(int i = 1 ; i <= Q ; i++){
			QQ[i] = sc.nextLong();
		}

		AA[A+1] = 100000000001L;
		BB[B+1] = 100000000001L;

		AA[0] = (long) -100000000001l;
		BB[0] = (long) -100000000001l;
		sc.close();

		int s1 = 0;
		int t1 = 0;



		for(int i = 1 ; i <= Q ; i++){
			int L = 0;
			int R = A+1;
			while(L<R){
				int M = (L+R)/2;
				if(AA[M]<QQ[i] && AA[M+1]>QQ[i]){
					s1 = M;
					break;
				}
				else if(AA[M+1] < QQ[i]){
					L = M+1;
				}
				else if(AA[M] > QQ[i]){
					R = M;
				}
			}

			int L1 = 0;
			int R1 = B+1;
			while(L1<R1){
				int M = (L1+R1)/2;

				if(BB[M]<QQ[i] && BB[M+1]>QQ[i]){
					t1 = M;
					break;
				}
				else if(BB[M+1] < QQ[i]){
					L1 = M+1;
				}
				else if(BB[M] > QQ[i]){
					R1 = M;
				}
			}
			//System.out.println(i + " " + AA[s1] + " " + AA[s1+1] + " " + BB[t1] + " " + BB[t1+1]);
			long[] SS = {AA[s1],AA[s1+1]};
			long[] TT = {BB[t1],BB[t1+1]};
			long ans = 90000000001l;
				for(int ii = 0 ; ii < 2 ; ii++){
					for(int jj = 0 ; jj < 2 ; jj++){
						//System.out.println(QQ[i] + " " + SS[ii] + " " + TT[jj]);
						if(SS[ii] > 0 && TT[jj] > 0 && SS[ii] <  100000000001L && TT[jj]<  100000000001L){
							ans = Math.min(ans, Math.abs(QQ[i]-SS[ii])+Math.abs(SS[ii]-TT[jj]));
							ans = Math.min(ans, Math.abs(QQ[i]-TT[jj])+Math.abs(TT[jj]-SS[ii]));
							//System.out.println(ans);
						}
					}
				}
				System.out.println(+ans);
		}

	}
}