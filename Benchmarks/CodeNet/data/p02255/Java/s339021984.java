import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int i,j,v,n,A[]=new int[N];
		for(i=0;i<N;i++){
			A[i]=scan.nextInt();
		}
		for(n=0;n<N;n++){
			if(n!=N-1){
				System.out.print(A[n]+" ");
			}
			else{
				System.out.println(A[n]);
			}
		}
		for(i=1;i<N;i++){
			v=A[i];
			j=i-1;
			while(j>=0 && A[j]>v ){
				A[j+1]=A[j];
				j--;
				A[j+1]=v;
			}
			for(n=0;n<N;n++){
				if(n!=N-1){
					System.out.print(A[n]+" ");
				}
				else{
					System.out.println(A[n]);
				}
			}
		}
	}

}