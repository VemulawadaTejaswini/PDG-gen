import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = 0;
        long b = 0;
        long ab = 0;
        String tmp;
        long ba = 0;
        long n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            tmp = sc.next();
            if (tmp.charAt(0) == 'B' && tmp.charAt(tmp.length() - 1) == 'A') {
                ba++;
            } else if (tmp.charAt(0) == 'B') {
                b++;
            } else if (tmp.charAt(tmp.length() - 1) == 'A') {
                a++;
            }
            ab += (tmp.length() - tmp.replaceAll("AB", "").length()) / 2;
        }
        if (ba == 0) {
            System.out.println(Math.min(a, b) + ab);
        } else if(a==0&&b==0){
            System.out.println(ba-1+ab);
        }else{
            System.out.println(ba+Math.min(a,b)+ab);
        }

    }
}