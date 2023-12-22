import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        // 文字列切り出し
        int ss = 0;
        for(int i = 0; i < s.length(); i++) {
            ss += ctoi(s.charAt(i));
        }
        if(ss%9==0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    static int ctoi(char c) {
        if ('0' <= c && c <= '9') {
            return (int)(c-'0');
        }
        return -1;
      }
    
}

