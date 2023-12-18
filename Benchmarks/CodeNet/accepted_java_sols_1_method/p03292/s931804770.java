import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] as = new int[3];
        as[0] = sc.nextInt();
        as[1] = sc.nextInt();
        as[2] = sc.nextInt();

        Arrays.sort(as);

        System.out.println(as[1] - as[0] + as[2] - as[1]);
    }

}