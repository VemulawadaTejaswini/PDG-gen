import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int N = 0;
		
		if(A>B) {
			N = A;
		}else {
			N = B;
		}
		
		int wk = 0;
		
		for(int i = 0;i < N;i++){
			if(Math.abs(A-i)==Math.abs(B-i)) {
				System.out.println(i);
		   		sc.close();
		        return ;
			}
		}
		
		System.out.println("IMPOSSIBLE");

   		sc.close();
        return ;

    }
    
}

