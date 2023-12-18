import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int len = s.length();
        
        boolean first = true;
        boolean second = true;
        boolean third  = true;

        for(int i = 0; i < len; ++i){
            if(s.charAt(i) == s.charAt(len - 1 - i)) {
                first = true;
            }
            else {
                first = false;
                break;
            }
        }

        if(first) {
            for(int i = 0; i < (len - 1) / 2; ++i) {
                if(s.charAt(0) == s.charAt((len - 1) / 2 -1)) second = true;
                else {
                    second = false;
                    break;
                }
            }
            if(second){
                for(int i = (len + 3) / 2 - 1; i < len; ++i) {
                    if(s.charAt(i) == s.charAt(len - 1 - i)) third = true;
                    else {
                        third = false;
                        break;
                    }
                }
                if(third) System.out.println("Yes");  // 強い回文である
                else System.out.println("No");  // 回文だが3つめの条件を満たさない

            }
            else System.out.println("No");  //回文だが, 2つめの条件を満たさない

        }
        else System.out.println("No");  // そもそも回文でない


    }
}