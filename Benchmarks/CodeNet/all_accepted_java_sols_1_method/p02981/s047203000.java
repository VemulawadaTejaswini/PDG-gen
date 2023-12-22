import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int cnt = 0;
		if(A*N < B) {
			cnt = A*N;
		}else {
			cnt = B;
		}

		System.out.println(cnt);

   		sc.close();
        return ;

    }
    
}

