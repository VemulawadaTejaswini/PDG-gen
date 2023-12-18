import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int d = Integer.parseInt(s1[1]);


        int result=n/(2 * d + 1);

        if (n % (2*d+1) == 0) {
        	result=n/(2 * d + 1);
        } else {
        	result=n/(2 * d + 1) +1;
        }

        System.out.println(result);
    }
}
