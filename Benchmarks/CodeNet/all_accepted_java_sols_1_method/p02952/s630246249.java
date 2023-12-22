import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int n = (String.valueOf(N)).length();

	int count = 0;
	int x = 10;
	int i;
	for (i = 1; i < n; i++, x *= 10) {
	    if ((i % 2) == 1) 
		count += x - (x / 10);
	}
	if ((i % 2) == 1)
	    count += N - (x / 10) + 1;

	System.out.println(count);
    }
}