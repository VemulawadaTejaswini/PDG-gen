import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Y = scanner.nextInt()/1000;
		int num = 0;
		for(int i = 0;i < N+1;i++){
			for(int j = 0;j < N+1;j++){
				//				for(int l = N - (i +j) ;l + i + j< N+1;l++){
				int l = N -(i+j);
				if(l >= 0){
					if(i + 5*j + 10*l == Y ){
						System.out.println(l+" "+j+" "+i);
						return;
					}
				}
			}

		}


		System.out.println(-1+" "+-1+" "+-1);

	}
}
