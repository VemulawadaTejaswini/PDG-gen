import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int d1 = Math.abs(a1 - a2);
        int d2 = Math.abs(a3 - a2);
        int d3 = Math.abs(a1 - a3);
        int[] d = new int[]{d1,d2,d3};
        Arrays.sort(d);
        System.out.println(d[0] + d[1]);
    }
}