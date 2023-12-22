import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 9; i++) {
        	int s = n / i;
        	int m = n % i;
        	if(m == 0 && s < 10) {
        		System.out.println("Yes");
        		return;
        	}


        }

        System.out.println("No");
        return;
    }
}