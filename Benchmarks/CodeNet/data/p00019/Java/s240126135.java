import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new java.util.Scanner(System.in);
		int n = scanner.nextInt();

        if (n <0)
            System.out.println("???????????´??°????????\?????????????????????");
        else
            System.out.println(factorial(n));
    }

    static long factorial(int n){
        long fact = 1;
        if (n == 0)
            return  fact;
        else { // in case of n > 0
            for (int i = n; i > 0; i--)
                fact *= i;
            return fact;
        }
    }
}