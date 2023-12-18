import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        for(int n = scn.nextInt(); n > 0; n--) {
            sb.append(scn.next());
        }

        String src = sb.toString();
        int ans = -1;
        while(src.indexOf(String.valueOf(++ans)) >= 0);
        System.out.println(ans);
    }
}