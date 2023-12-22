import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int T = sc.nextInt();
	long sum = 0;
	int current = sc.nextInt();
	for(int i = 1; i<N; i++) {
	    int next = sc.nextInt();
	    if(next-current<T) sum += next-current;
	    else sum += T;
	    current = next;
	}
	System.out.println(sum+T);
    }
}