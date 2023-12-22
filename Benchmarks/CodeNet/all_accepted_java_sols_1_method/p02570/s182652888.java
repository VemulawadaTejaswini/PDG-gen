import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long d = sc.nextInt();
        long t = sc.nextInt();
        long s = sc.nextInt();

        boolean b = s * t >= d;
        System.out.println(b ? "Yes": "No");
    }

}