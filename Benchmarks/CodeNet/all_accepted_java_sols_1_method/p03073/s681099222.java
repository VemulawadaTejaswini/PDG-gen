import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count1 = 0;
        int count2 = 0;
        char one = '1';
        char zero = '0';
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(i % 2 == 0) { // zeroから
                if(c != zero) count1++;
            } else {
                if(c != one) count1++;
            }
            if(i % 2 != 0) { // oneから
                if(c != zero) count2++;
            } else {
                if(c != one) count2++;
            }
        }
        System.out.println(Math.min(count1, count2));
    }
}
