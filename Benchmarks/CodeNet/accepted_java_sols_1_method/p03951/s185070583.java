import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int ans = (s+t).length();

        for(int i = 0;i < n;i++){
            String a = s.substring(i,n);
            String b = t.substring(0,n-i);
            if(a.equals(b)){
                ans -= a.length();
                break;
            }
        }
        System.out.println(ans);

    }
}