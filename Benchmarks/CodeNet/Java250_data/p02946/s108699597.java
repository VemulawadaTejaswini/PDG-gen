import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int x = scan.nextInt();

        if (k == 1) {
            System.out.print(x);
            return;
        }

        int start = x - k + 1;
        int end =  x + k - 1;

        for(; start <= end; start++) {
            if(start > x - k + 1)System.out.print(" ");
            System.out.print(start) ;
        }

    }
}