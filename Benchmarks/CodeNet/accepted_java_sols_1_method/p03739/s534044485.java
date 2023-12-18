import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]a =new int[n];
		long[]sig = new long[n];
		int[]acopy = new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
			acopy[i]=a[i];
/*			if(i==0){
				siga[i]=a[i];
			}else{
				siga[i]=siga[i-1]+a[i];
			}*/
		}




		//第一項目が正の場合と負の場合


		//a[0]が0の場合を考える
		long cnt=0;

		if(a[0]==0){
			a[0]++;
			cnt++;
		}
		sig[0]=a[0];
		for(int i=1;i<n;i++){
			sig[i]=sig[i-1]+a[i];

			//積が0なら符号が異なるように+-1
			if(sig[i]*sig[i-1]==0){
				if(sig[i-1]>0){
					a[i]--;
					cnt++;
				}else{
					a[i]++;
					cnt++;
				}
				sig[i]=sig[i-1]+a[i];
			}

			//積が負なら条件を満たしているのでok
			else if(sig[i]*sig[i-1]<0){
			}

			//積が正なら負になるまで変える
			else{
				if(sig[i-1]>0){
					a[i]-=(sig[i]+1);
					cnt+=sig[i]+1;
				}else{
					a[i]+=-sig[i]+1;
					cnt+=-sig[i]+1;
				}
				sig[i]=sig[i-1]+a[i];
			}

		}


		long cnt2=0;
		if(acopy[0]==0){
			acopy[0]--;
			cnt2++;
		}else if(acopy[0]>0){
			cnt2 +=acopy[0]+1;
			acopy[0]=-1;
		}else{
			cnt2+=-acopy[0]+1;
			acopy[0]=1;
		}
		sig[0]=acopy[0];
		for(int i=1;i<n;i++){
			sig[i]=sig[i-1]+acopy[i];

			//積が0なら符号が異なるように+-1
			if(sig[i]*sig[i-1]==0){
				if(sig[i-1]>0){
					acopy[i]--;
					cnt2++;
				}else{
					acopy[i]++;
					cnt2++;
				}
				sig[i]=sig[i-1]+acopy[i];
			}

			//積が負なら条件を満たしているのでok
			else if(sig[i]*sig[i-1]<0){
			}

			//積が正なら負になるまで変える
			else{
				if(sig[i-1]>0){
					acopy[i]-=(sig[i]+1);
					cnt2+=sig[i]+1;
				}else{
					acopy[i]+=-sig[i]+1;
					cnt2+=-sig[i]+1;
				}
				sig[i]=sig[i-1]+acopy[i];
			}

		}


		System.out.println(Math.min(cnt, cnt2));

	}

}
