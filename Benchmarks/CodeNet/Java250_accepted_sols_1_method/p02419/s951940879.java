import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String w = sc.next().toLowerCase();

        int cnt = 0;
        while (true) {
            String s = sc.next();
            
            if (s.equals("END_OF_TEXT"))
                break;
            
            if (s.toLowerCase().equals(w))
                cnt++;
        }
        System.out.println(cnt);
    }
}

