import java.util.Arrays;
import java.util.Scanner;

public class Main {
	final int k=200000;
	boolean prime[]=new boolean[k+1];
	int ans[]=new int[k+1];
	public static void main(String[] args) {
		new Main().run();

	}
	void run(){
		Scanner sc=new Scanner(System.in);
		Arrays.fill(prime, true);
		prime[0]=prime[1]=false;
		for(int i=2;i<k;i++){
			if(prime[i]){
				for(int j=2;i*j<=k;j++){
					prime[i*j]=false;
				}
			}
		}

		int n,p;

		while(true){
			n=sc.nextInt();
			p=sc.nextInt();
			if(n==-1 && p==-1) break;
			System.out.println(slove(n+1,p));
		}
	}
	int slove(int n,int p){
		int count=0;

		for(int i=n;i<k;i++){
			if(prime[i]){
				for(int j=n;j<=i;j++){
					if(prime[j]){
						ans[count]=j+i;
						System.out.println(i+" "+j+" "+(j+i));
						if(count==5*p){
							Arrays.sort(ans,0,count);
							for(int k=0;;k++){
								if(k==p){
									return ans[k-1];
								}
							}
						}
						count++;
					}
				}
			}
		}
		return -1;
	}//s

}