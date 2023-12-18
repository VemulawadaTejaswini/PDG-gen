import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 753;
        for(int i = 0;i < s.length()-2;i++){
            int num = Integer.parseInt(s.substring(i, i+3));
            int sa = Math.abs(753-num);
            if(ans > sa)
            ans = sa;
        }
        System.out.println(ans);
    }
}