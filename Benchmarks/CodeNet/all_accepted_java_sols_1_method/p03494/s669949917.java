import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int N =sc.nextInt();
			int[] A=new int[N];			
			int ans=40;
			int tmp=0;
						
			for(int i=0;i<N;i++){
				A[i]=sc.nextInt();
			}
			for(int i=0;i<N;i++){
				tmp=0;
				for(;A[i]%2==0;){
					tmp++;		
					A[i]=A[i]/2;
				}
				if(tmp<ans){
					ans=tmp;
				}
			}
			System.out.println(ans);
		}
}