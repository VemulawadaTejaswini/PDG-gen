import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replaceAll("BC", "D");
        int aseq = 0;
        long ans = 0L;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A') aseq++;
            else if(s.charAt(i) == 'D') ans += aseq;
            else aseq = 0;
        }
        System.out.println(ans);
        sc.close();

    }

}
