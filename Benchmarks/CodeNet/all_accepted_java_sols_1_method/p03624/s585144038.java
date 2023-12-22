import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c[] = new int[26];
        for(int i = 0;i<s.length();i++){
            int kari = s.charAt(i) - 'a';
            c[kari] = 1;
        }
        for(int i = 0;i<26;i++){
            if(c[i] == 0){
                System.out.println((char)('a' + i));
                return;
            }
        }
        System.out.println("None");
        sc.close();
    }
}