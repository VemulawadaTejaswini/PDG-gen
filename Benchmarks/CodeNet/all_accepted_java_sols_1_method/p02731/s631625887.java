import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        System.out.println(String.format("%.9f", (double)(L*L*L)/27));
    }
}