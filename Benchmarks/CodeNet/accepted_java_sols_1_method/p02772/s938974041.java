import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
		}
		boolean approved = true;
		for(int a : A){
			if(a % 2 == 0){
				if(a % 3 == 0 || a % 5 == 0){
					
				}else{
					approved = false;
					break;
				}
			}
		}
		if(approved){
			System.out.println("APPROVED");
		}else{
			System.out.println("DENIED");
		}
	}
}
