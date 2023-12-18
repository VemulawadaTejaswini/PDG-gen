import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int W = sc.nextInt();
        String result = (W >= S) ? "unsafe" : "safe";

        System.out.println(result);
    }
}
