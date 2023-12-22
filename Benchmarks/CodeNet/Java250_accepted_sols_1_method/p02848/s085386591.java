import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        String A = sc.next();
        String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<A.length();i++){
            char each = A.charAt(i);
            int num = S.indexOf(each);
            if(num+N<26)num+=N;
            else num=num+N-26;
            each = S.charAt(num);
            sb.append(each);
        }
        System.out.println(sb);
    }
}