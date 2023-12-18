import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        int leftIdx = 0;
        int cnt = 0;
        int maxLen = 0;
        for(int i = 0; i < len; i++) {
          char ch = str.charAt(i);
          if(ch == '0') {
            cnt++;
            while(i < len - 1 && str.charAt(i+1) == '0') {
              i++;
            }
          }
          while(cnt > k) {
            if(str.charAt(leftIdx) == '0') {
              cnt--;
              while(leftIdx < i && str.charAt(leftIdx) == '0') {
                leftIdx++;
              }
            } else {
              leftIdx++;
            }
          }
          maxLen = Math.max(maxLen, i - leftIdx + 1);
        }
        System.out.println(maxLen);
    }
}