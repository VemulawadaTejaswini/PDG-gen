import java.util.Scanner;

public class Main  {
	

	public static  void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int soe =0;
	int N = sc.nextInt();
	long[] A = new long [N];	
	long kai = 1;
	long ban = 1000000000000000000L;
		
		while(soe != N) {
			A[soe] = sc.nextLong();
			
			kai = kai * A[soe];
			soe++;
			
		}
		
		
		
		
		 if(kai <= ban ){
			
			System.out.println(kai);
		}else{
			System.out.println(-1);
		} 
		
			
	}
}
