	import java.util.*;
public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int N = sc.nextInt();
			// スペース区切りの整数の入力
			int M = sc.nextInt();
			int L =0;
			int R =0;
			int Lmax=0;
			int Rmin=N;
			for (int i = 0; i<M ; i++){
				L=sc.nextInt();
				R=sc.nextInt();
				if(Lmax<=L){
					Lmax = L;
				}
				if(Rmin>=R){
					Rmin = R;
				}
			}
			if(Rmin-Lmax>=0){
				System.out.println(Rmin-Lmax+1);
			}else{
				System.out.println(0);
			}
				
		}

	}