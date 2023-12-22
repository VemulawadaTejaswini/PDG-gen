import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int n = sca.nextInt();
	int a[] = new int[n];
	int sum = 0;
	for(int i = 0; i < n; i++) {
		a[i] = sca.nextInt();
	}
	for(int i = 0; i < n; i++) {
		if(sum + 1 == a[i]) {
			sum++;
		}
	}

	if(sum == 0) {
		System.out.println(-1);
	}
	else {
		System.out.println(n-sum);
	}

	sca.close();
	}
}