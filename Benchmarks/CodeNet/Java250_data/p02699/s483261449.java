import java.util.*;

public class Main {

    public static List<List<Integer>> switchList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int W = sc.nextInt();
        sc.close();

        if (W >= S) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }

    }

}