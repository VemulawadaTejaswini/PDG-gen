import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int N = scan.nextInt();
			
			int[] V= new int[N];
			int[] C=new int[N];
			int sum=0;
			for(int i=0;i<N;i++){				
				V[i]=scan.nextInt();		
			}
			for(int i=0;i<N;i++){				
				C[i] = scan.nextInt();					
			}
			for(int i=0;i<N;i++){
				
				if(V[i]>C[i]){
					 sum += V[i]-C[i];
				}
			}
			System.out.println(sum);
	}

}