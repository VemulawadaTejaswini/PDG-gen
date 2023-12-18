import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = sc.nextLong();
        char c = 'a';
        int a = 0;
        for(int i = 0;i < S.length();i++){
            if(S.charAt(i) != '1'){
                c = S.charAt(i);
                a = i+1;
                break;
            }
        }
        if(a == 0 || a > K)  System.out.println(1);
        else    System.out.println(c);
    }
}