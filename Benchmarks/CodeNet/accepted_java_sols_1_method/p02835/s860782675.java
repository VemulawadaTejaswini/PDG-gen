import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int A[] = new int[3];
	for (int i = 0; i < A.length; i++)
	    A[i] = sc.nextInt();

	if (A[0] + A[1] + A[2] >= 22)
	    System.out.println("bust");
	else
	    System.out.println("win");

    }
}