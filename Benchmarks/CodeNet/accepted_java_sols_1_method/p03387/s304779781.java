import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		int A = Integer.parseInt(Ws[0]);
		int B = Integer.parseInt(Ws[1]);
		int C = Integer.parseInt(Ws[2]);

		int ans = 0;
		boolean flg =true;
		while(flg){
			flg=false;
			if(Math.abs(A-B)>1){
				if(A<B){
					A+=2;
					ans++;
				}else{
					B+=2;
					ans++;
				}
				flg=true;

			}
			if(Math.abs(A-C)>1){
				if(A<C){
					A+=2;
					ans++;
				}else{
					C+=2;
					ans++;
				}
				flg=true;
			}
			if(Math.abs(B-C)>1){
				if(B<C){
					B+=2;
					ans++;
				}else{
					C+=2;
					ans++;
				}
				flg=true;
			}
		}

		if(A<B){
			if(A !=C){
				ans+=2;
				A+=2;
				B++;
				C++;
			}else{
				ans++;
				A++;
				C++;
			}
		}

		if(A<C){
			if(A !=B){
				ans+=2;
				A+=2;
				B++;
				C++;
			}else{
				ans++;
				A++;
				B++;
			}
		}

		if(B<A){
			if(B !=C){
				ans+=2;
				B+=2;
				A++;
				C++;
			}else{
				ans++;
				B++;
				C++;
			}
		}

		if(B<C){
			if(B !=A){
				ans+=2;
				B+=2;
				A++;
				C++;
			}else{
				ans++;
				B++;
				A++;
			}
		}

		if(C<A){
			if(C !=B){
				ans+=2;
				C+=2;
				A++;
				B++;
			}else{
				ans++;
				C++;
				B++;
			}
		}

		if(C<B){
			if(C !=A){
				ans+=2;
				B+=2;
				A++;
				C++;
			}else{
				ans++;
				C++;
				A++;
			}
		}



		System.out.println(ans);

	}

}
