import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	if(A==B) System.out.println(2*A);
	else if(A>B)System.out.println(A+A-1);
	else System.out.println(B+B-1);
    }
}