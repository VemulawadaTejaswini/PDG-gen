import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String[] s = S.split("");
        String T = scan.next();
        String[] t = T.split("");
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            if(!(s[i].equals(t[i]))){
                s[i] = t[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
