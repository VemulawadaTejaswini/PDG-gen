import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int cnt = 0, ans = 0;
        String acgt = "ACGT";

        for(int i = 0; i < input.length(); i++){
            String str = String.valueOf(input.charAt(i));
            if(acgt.indexOf(str) > -1) cnt++;
            else{
                ans = ans > cnt ? ans : cnt;
                cnt = 0;
            }
        }
        ans = ans > cnt ? ans : cnt;
        System.out.println(ans);
    }
}