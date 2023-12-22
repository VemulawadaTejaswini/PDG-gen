import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ans = s.toCharArray();
        ans[5] = ' ';
        ans[13] = ' ';
        System.out.println(new String(ans));
    }
}
