import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a = s.charAt(0);
        int c = 1;
        char b ='a';
        int d = 0;
        boolean ans = true;
        for (int i = 1; i < 4; i++) {
            if(a != s.charAt(i) && d == 0){
                b = s.charAt(i);
                d++;
            }else if(a == s.charAt(i)){
                c++;
            }else if(b == s.charAt(i)){
                d++;
            }else{
                ans = false;
            }
        }
        if(c != 2 || d != 2) ans = false;
        System.out.println(ans ? "Yes" : "No");
        sc.close();
    }

}
