import java.util.Scanner;
public class Main {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();

	if(C-A+B>=0) {
	System.out.print(C - A + B);
	}
	else if(C-A+B<0) {
		System.out.print(0);
	}

}
}