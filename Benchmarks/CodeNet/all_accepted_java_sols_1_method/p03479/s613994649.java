import java.util.Scanner;

class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//int N = scanner.nextInt();
		long A = scanner.nextLong();
		long B = scanner.nextLong();
		int sum = 1;
		long sub = A;

		while(true){
			sub *= 2;
			if(sub > B ){
				break;
			}
			sum++;
		}

		System.out.println(sum);

	}
}

