import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ0258().doIt();
	}

	class AOJ0258{
		int[] input;
		int n;

		void solve(){
			int result = -1;
			for(int i=1;i<=100;i++){
				int cnt = 0;
				int memo = -1;
				for(int s=0;s<n;s++){
					if(input[s+1]-input[s]!=i){
						if(s==n-1){
							if(input[s]-input[s-1]==i){
								
								memo = n;
							}
						}else{
							memo = s;
						}
						cnt++;
					}

				}
				if(cnt<=2){
					result = input[memo];
					break;
				}
				//				System.out.println(cnt);
			}
			System.out.println(result);
		}

		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				if(n==0)break;
				input = new int[n+1];
				for(int i=0;i<=n;i++)input[i] = in.nextInt();
				solve();
			}
		}
	}

}