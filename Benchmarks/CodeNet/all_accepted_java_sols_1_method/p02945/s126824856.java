import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int A, B, max;
	A = sc.nextInt();
	B = sc.nextInt();

	max = A + B;
	if (max < (A - B))
	    max = A - B;
	if (max < (A * B))
	    max = A * B;

	System.out.println(max);
    }
}