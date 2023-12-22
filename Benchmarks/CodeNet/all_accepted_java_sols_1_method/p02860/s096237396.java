import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        String str = sc.next();

        

        if(n % 2 == 1) {
            System.out.println("No");
            return;
        }
        else {
            String s_1 = str.substring(0, n/2);
            String s_2 = str.substring(n/2, n);

            //System.out.println(s_1);
            //System.out.println(s_2);
            if(s_1.equals(s_2)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}