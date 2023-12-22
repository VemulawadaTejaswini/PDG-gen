import java.util.Scanner;

public class Main {
    //Bounding
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] L = new int[n];
        for (int i = 0; i < n; i++) L[i] = sc.nextInt();
        int d = 0, index = 1;
        while (d < x && index <= n) {
            d = d + L[index - 1];
            index++;
        }
        if (d <= x) System.out.println(index);
        else System.out.println(index - 1);
    }
}
