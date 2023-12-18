import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,q,i,j,k,flg;
		n = sc.nextInt();
		int [] A = new int[n];
		for(i=0;i<n;i++){
			A[i] = sc.nextInt();
		}
		q = sc.nextInt();
		int [] M = new int[q];
		for(j=0;j<q;j++){
			M[j] = sc.nextInt();
		}
		
		for(i=0;i<q;i++){
			flg =0;
			for(j=0;j<=n;j++){
				if(flg==1) break;
				for(k=j+1;k<n;k++){
					if(M[i] == A[j]+A[k]) {
						flg =1;
						break;
					}
				}
			}
			if(flg==1){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}

}


