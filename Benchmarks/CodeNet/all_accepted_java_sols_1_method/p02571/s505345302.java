import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 配列
        String s = sc.next();
        String t = sc.next();

        int df = s.length() - t.length();
        int ans = 9999999;
        for (int i = 0;i <= df;i++){
            int dd = 0;
            for (int j = 0;j < t.length(); j++) {
                if(s.charAt(i + j) != t.charAt(j)) {
                    dd++;
                }
            }
            if(ans > dd) {
                ans = dd;
            }
        }
            System.out.println(ans);
    }
   
}

