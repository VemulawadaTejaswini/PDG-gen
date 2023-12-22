import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	int cntMax=N/2;
	if(N % 2 == 1) {
	    cntMax += 1;
	}
	if(cntMax>=K) {
	    System.out.println("YES");
	}else {
	    System.out.println("NO");
	}
    }
}