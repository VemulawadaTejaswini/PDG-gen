import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sp = s.split("");
        int[] n = new int[4];
        String ans = "No";
        for(int i=0; i<4; i++) {
            n[i] = Integer.parseInt(sp[i]);
        }
        if(n[0] == n[1] && n[1] == n[2] || n[1] == n[2] && n[2] == n[3]) ans = "Yes";
        System.out.println(ans);
    }
}