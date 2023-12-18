import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N; i++){
			int K = sc.nextInt();
			int P = sc.nextInt();
			if(K < P)
				System.out.println(K);
			if(K > P)
				if(K%P == 0)
				System.out.println(P);
				else
					System.out.println(K%P);
		}
	}
}