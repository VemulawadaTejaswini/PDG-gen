

import java.util.Scanner;

// 十分大きな回数を重ねると何かが収束する
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();

        int inchiNum = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                inchiNum++;
            } else {
                break;
            }
        }
        if(inchiNum >= k) 
        {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(inchiNum));
        }
    }
}
