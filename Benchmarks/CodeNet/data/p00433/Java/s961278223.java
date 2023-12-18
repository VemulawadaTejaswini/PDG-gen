import java.util.*;

public class Main {
    public static void main(String[] args) {
        int s, t;
        try(Scanner scn = new Scanner(System.in)) {
            s = sum(scn.nextLine().split(" "));
            t = sum(scn.nextLine().split(" "));
        }
        System.out.println(s > t ? s : t);
    }

    private static int sum(String... scores) {
        int rslt = 0;
        for(String score : scores) {
            rslt += Integer.parseInt(score);
        }
        return rslt;
    }
}