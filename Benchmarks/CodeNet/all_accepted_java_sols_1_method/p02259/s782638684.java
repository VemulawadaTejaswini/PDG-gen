import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A[] = new int[N];
		for(int i=0;i<N;i++){
			A[i]=Integer.parseInt(sc.next());
		}
		sc.close();
		
		boolean flag = true;
		int count = 0;
		while(flag){
			flag=false;
			for(int j=N-1;j>0;j--){
				if(A[j]<A[j-1]){
					int temp=A[j];
					A[j]=A[j-1];
					A[j-1]=temp;
					count++;
					flag=true;
				}
			}
		}
		
		for(int i=0;i<N-1;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println(A[N-1]);
		System.out.println(count);
		

	}
	

}