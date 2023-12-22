import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int cards[]  = {1, 0, -1};
        int counts[] = new int[3], n, maxValue;

        for(int i = 0; i < counts.length; i++) {
            counts[i] = scan.nextInt();
        }
        n = scan.nextInt();

        maxValue = 0;
        for(int i = 0; i < counts.length; i++) {
            if(n >= counts[i]) {
                maxValue += cards[i] * counts[i];
                n -= counts[i];
            } else {
                maxValue += cards[i] * n;
                n = 0;
            }
        }

        System.out.println(maxValue);
        scan.close();
        return;
    }
}