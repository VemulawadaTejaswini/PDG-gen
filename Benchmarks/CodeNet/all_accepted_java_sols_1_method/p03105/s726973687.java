import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

    	Scanner sc = new Scanner(System.in);

    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();

    	int cnt = 0;

    	cnt = B / A;
    	cnt = (cnt > C) ? C : cnt;

		System.out.println(cnt);
    }
}