import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int l = -1;
        int r = -1;
        for (int i = 0; i < s.length-1; i++) {
            if(s[i] == s[i+1]){
                l = i+1;
                r = i+2;
                break;
            }
            if(i < s.length-2 && s[i] == s[i+2]){
                l = i+1;
                r = i+3;
                break;
            }
        }
        System.out.println(l + " " + r);
        sc.close();

    }

}
