import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true) {
            String num = sc.next();
            int[] x;
            x = new int[1000];
            int length = num.length();
            int sum = 0;

            for (int i = 0; i < length; i++)
                x[i] = num.charAt(i) - '0';

            for (int i = 0; i < length; i++)
                sum += x[i];

            if (sum == 0) {
                break;
            } else {
                System.out.println(sum);
            }
        }
    }
}

