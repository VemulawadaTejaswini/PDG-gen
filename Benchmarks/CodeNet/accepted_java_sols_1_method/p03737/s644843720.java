import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.next().split("");
        String[] s2 = sc.next().split("");
        String[] s3 = sc.next().split("");

        System.out.println(s1[0].toUpperCase() + s2[0].toUpperCase() + s3[0].toUpperCase());
    }
}
