import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 1) {
            System.out.println((double)(n/2+1)/n);
        } else {
            System.out.println(0.5d);
        }


    }
}
