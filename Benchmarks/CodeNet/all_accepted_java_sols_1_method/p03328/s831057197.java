import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] valu = new int[1000];
        for (int i = 1; i <= 999; i++) {
            valu[i] = (i * (i+1)) / 2;
        }
        int a = input.nextInt();
        int b = input.nextInt();
        for (int i = 1; i < 1000; i++) {
            if ( valu[i] >= a   &&  valu[i+1] >= b  ){
                if ((a - valu[i]) == (b - valu[i+1])){
                    System.out.println( valu[i] - a);
                    break;
                }
            }
        }

    }
}
