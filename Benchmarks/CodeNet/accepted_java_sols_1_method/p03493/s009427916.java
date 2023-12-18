import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        String a = sc.next();

        for (int i = 0; i < 3; i++) {
            String str = String.valueOf(a.charAt(i));
            if (String.valueOf(str).equals("1")) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}