import java.util.Scanner;
public class Main{
	public void solve(){
		Scanner sc=new Scanner(System.in);
		int N,k;
		int ichi=0;
		int fuku=1;
		N=sc.nextInt();
		while(N!=0){
			for(int i=0;i<N;i++){
				k=sc.nextInt();
				if(k>=2){
					fuku++;
				}
				if(k==1){
					ichi++;
				}
			}
			if(fuku>=2){
				System.out.println(ichi+fuku);
			}else{
				System.out.println("NA");
			}
			fuku=1;
			ichi=0;
			N=sc.nextInt();
		}
	}
	public static void main(String[]args){
		Main obj =new Main();
		obj.solve();
	}
}