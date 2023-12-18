import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int cnt=0;
			long mtp=1;
			int idx=1;
			while(n>=idx){
				int idx2=idx;
				while(true){
					if(idx2%10==0){
						cnt++;
						idx2/=10;
					}
					else{
						break;
					}
				}
				mtp*=idx2;
				while(true){
					if(mtp%10==0){
						mtp/=10;
						cnt++;
					}
					else{
						break;
					}
				}
//				System.out.print("idx="+idx+" mtp="+mtp);
				if(100<mtp){
					long tmp=mtp/100;
					mtp=mtp-(100*tmp);
				}
//				System.out.println("-->"+mtp);
				idx++;
			}
			System.out.println(cnt);
		}
	}
}