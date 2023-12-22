import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int odd = 0;
        float oddness;
        for (int i=1; i<=number ; i++) {
            if(i%2 == 1 ) {
                odd = odd + 1;
            }
        }
        oddness = (float) odd/number;
        System.out.printf("%.12f",oddness);
    }
}
