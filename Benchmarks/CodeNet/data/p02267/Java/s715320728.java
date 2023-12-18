import java.util.Scanner;
class tansaku{
	Scanner sc = new Scanner(System.in);
	int n;
	int[] S;
	int q;
	int[] T;
	int C;
	void t(){
		n=sc.nextInt();
		S=new int[n];
		for(int i=0; i<n; i++){
			S[i]=sc.nextInt();
		}
		q=sc.nextInt();
		T=new int[q];
		for(int j=0; j<q; j++){
			T[j]=sc.nextInt();
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<q; j++){
				if(S[i]==T[j]){
					C++;
					break;
				}
			}
		}
		System.out.println(C);
	}
	public static void main(String[]agrs){
		new tansaku().t();
	}
}