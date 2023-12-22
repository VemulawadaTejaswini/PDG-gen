import java.util.Scanner;

public interface Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;

		for(int i = 0; i < N; i++) {
			int begin = sc.nextInt();
			int end = sc.nextInt();
			count += end - begin + 1;
		}

		System.out.println(count);
	}

}