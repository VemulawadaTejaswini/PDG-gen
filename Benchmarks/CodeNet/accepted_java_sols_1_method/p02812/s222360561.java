import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int o = 0;
        String sub = "ABC";
        int n = sc.nextInt();
        String s = sc.next();

            while ((i = s.indexOf(sub, i)) != -1) {
                o++;
                i++;
            }


        System.out.println(o);
    }
}