import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] i = {s.nextInt(), s.nextInt(), s.nextInt()};
        java.util.Arrays.sort(i);
        System.out.printf("%d %d %d\n", i[0], i[1], i[2]);
    }
}