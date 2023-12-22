import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		boolean k=false;
		int min=1000000005,key=0,mi=min,ke=0;
		for(int i=0;i<N;i++){
			A[i]=stdIn.nextInt();
			if(min>A[i]){
				min=A[i];key=i;
			}
		}
		while(true){
			for(int i=0;i<N;i++){
				A[i]%=min;
				if(i==key)
					A[i]=min;
				if(A[i]==1){
					System.out.println(1);
					System.exit(0);
				}
				if(A[i]!=0&&i!=key){
					k=true;
					if(mi>A[i]){
						mi=A[i];
						ke=i;
					}
				}
			}
			if(k){
				min=mi;key=ke;
				mi=1000000005;k=false;
			}
			else
				break;
		}
		System.out.println(A[key]);
	}
}