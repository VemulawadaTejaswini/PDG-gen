import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i=a;i<=b;i++){
            boolean bool = true;
            String s = Integer.toString(i);
            for (int j=0;j<s.length();j++){
                if (s.charAt(j)!=s.charAt(s.length()-j-1))bool=false;
            }
            if (bool)ans++;
        }
        System.out.println(ans);
    }
}
