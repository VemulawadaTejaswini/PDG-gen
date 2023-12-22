import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pos = new int[5];
        int k;
        String result;

        for (int i = 0; i < 5; i++)
            pos[i] = sc.nextInt();

        k = sc.nextInt();

        if (pos[4] - pos[0] <= k)
            result = "Yay!";
        else
            result = ":(";

        System.out.println(result);
    }
}