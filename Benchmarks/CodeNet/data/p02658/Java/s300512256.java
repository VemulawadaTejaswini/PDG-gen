import java.util.Scanner;

public class Main  {
	

	public static  void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int soe =0;
	int N = sc.nextInt();
	long[] A = new long [N];	
	long kai = 1;
	boolean a = false;;
	long g = 1000000000;
	long v = 1000000000;
		
		while(soe != N) {
			A[soe] = sc.nextLong();
			if(A[soe] == 0) {
				System.out.println(0);
				a = true;
				break;
			}
			kai = kai * A[soe];
			soe++;
			
		}
		 if(kai >= g * v && a == false ) {
			System.out.println(-1);
		}else if(a == false){
			
			System.out.println(kai);
		}
			
	}
}
