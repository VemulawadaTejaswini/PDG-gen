import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int maxA = sc.nextInt();
        long res = 0;
        for(int i=1; i<N; i++){
            int A = sc.nextInt();
            maxA = Math.max(maxA,A);
            res = res + maxA - A;
            
        }
		System.out.println(res);
	}
}