import java.util.Scanner;

class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int sum = 0;
		for(int i = 1;i  <= N;i++){
			int x = i;
			int sub = 0;

			while(x >= 10){
				int valLen = String.valueOf( x ).length();    // けたが返される

				sub += x / (int)Math.pow(10, valLen-1);

				x -= (x / (int)Math.pow(10, valLen-1))* Math.pow(10, valLen-1);
			}
			sub += x;

			if(sub >= A && sub <= B){		
				sum += i;

			}
		}
		
		System.out.println(sum);

	}
}

