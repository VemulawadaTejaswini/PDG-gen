import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner inputs = new Scanner(System.in);
        int n = inputs.nextInt();
        int x = inputs.nextInt();
        int t = inputs.nextInt();

        int takoyakiMade = 0;
        int timeTook = 0;
        do {
            timeTook += t;
            takoyakiMade += x;
        } while(takoyakiMade < n);
        System.out.println(timeTook);
    }
}
