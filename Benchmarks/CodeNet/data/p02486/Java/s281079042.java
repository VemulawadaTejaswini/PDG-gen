
import java.util.Scanner;
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	int i, j, k;
	int n, x;
	int sum=0;
	int count=0;
	
	n = s.nextInt();
	x = s.nextInt();
	if(3<=n && n<=100){
	while(n!=0 && x!=0){//n,xが共に0出ない間
		for(i=1; i<n-1; i++){//iは１からn-2の間まで
			for(j=i+1; j<n; j++){//jはi+1からn-1の間まで
				for(k=j+1; k<n+1; k++){//kはj+1からnの間までをループ
					sum=i+j+k;
					if(sum==x){//三つの合計がxになればcountの値に1を加える
						count++;
					}
					}
				}
			}
		System.out.println(count);
		n = s.nextInt();
		x = s.nextInt();
		}
	}
	}
}