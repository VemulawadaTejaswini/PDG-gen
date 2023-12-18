import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] param = sc.nextLine().split(" ");
        int A = Integer.parseInt(param[0]);
        int B = Integer.parseInt(param[1]);
        System.out.println(A * B - A - B + 1);
    }
}