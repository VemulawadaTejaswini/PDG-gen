import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A' ||s.charAt(i) == 'T' ||s.charAt(i) == 'C' ||s.charAt(i) == 'G'){
                tmp++;
            }else if(ans < tmp){
                ans = tmp;
                tmp = 0;
            }
        }
        if(ans < tmp) ans = tmp;
        System.out.println(ans);
        sc.close();

    }

}
