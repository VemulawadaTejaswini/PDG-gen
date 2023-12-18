import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int a = N % 1000;
    	int ans = 1000-a;
    	System.out.println(ans);
    }
}