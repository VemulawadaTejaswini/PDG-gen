import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();
        long max = 0;
        
        max = Math.min(N, B-1) * A / B;
        
        System.out.print(max);
	}
}

