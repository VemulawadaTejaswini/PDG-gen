import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		long a = 0;
		for(int i = 1;i <= N;i++){
			if(i % K == 0){
				a++;
			}
			
		}
		if(K % 2 ==0){
			long b = 0;
			for(int i = 1;i <= N ;i++){
				if(i % K ==K /2){
					b++;
				}
			}
			System.out.println((long)(Math.pow(a, 3) + Math.pow(b, 3)));
			
		}else{
			System.out.println((long)(Math.pow(a, 3)));

		}


	}






}
