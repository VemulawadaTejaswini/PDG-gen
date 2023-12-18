import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int A = sc.nextInt();
	int B = sc.nextInt();
	int min = (A+B<=N)? 0: (A+B)-N;
	System.out.println((int)(Math.min(A,B)) + " " + min);
    }
}