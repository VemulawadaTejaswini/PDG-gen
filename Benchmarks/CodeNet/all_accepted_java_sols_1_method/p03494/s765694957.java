public class Main {
  public static void main(String[] args) {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	int n = scanner.nextInt();
	long[] a = new long[n];
	for (int i = 0; i < n; i++) {
		a[i] = scanner.nextLong();
	}
	
	int count = 0; // 2で割った回数
	while(true) {
		boolean hasOdd = false;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {
				hasOdd = true;
				break;
			}
		}
		if (hasOdd) {
			break;
		}
		for (int i = 0; i < n; i++) {
			a[i] = a[i] / 2;
		}
		count++;
	}
	System.out.println(count);
  }
}
