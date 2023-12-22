import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] c = S.toCharArray();
        for(int i = 0; i < S.length(); i++){
            int x = c[i] - 'A';
            x = (x + N) % 26;
            System.out.print((char)('A' + x));
        }
 }
}