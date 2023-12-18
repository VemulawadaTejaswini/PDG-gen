import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        scn.useDelimiter("\\D+");
        int cnt = 0;
        while(scn.hasNextInt()) {
            cnt += scn.nextInt();
        }
        System.out.println(cnt);
    }
}