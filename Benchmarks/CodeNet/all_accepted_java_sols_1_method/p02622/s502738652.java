import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String S = sc.next();
        String T = sc.next();
        String s[] = S.split("");
        String t[] = T.split("");
        for(int i=0;i<s.length;i++){
            if(!s[i].equals(t[i])){
                sum++;
            }
        }
        System.out.println(sum);
    }
}