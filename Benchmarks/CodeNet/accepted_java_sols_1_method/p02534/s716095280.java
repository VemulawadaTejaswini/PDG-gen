import java.util.*;

public class Main {


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String s = "";

        for (int i=0; i<n; i++) {
            s = s.concat("ACL");
        }
        System.out.println(s);

    }
}