import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;

        sc.useDelimiter(",");
        s1 = sc.next();
        s2 = sc.next();
        s3 = sc.next();

        System.out.println(s1 + " " + s2 + " " + s3);
        sc.close();
    }
}