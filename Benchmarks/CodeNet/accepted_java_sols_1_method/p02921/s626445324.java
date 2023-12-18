import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        char[] S = (sc.nextLine()).toCharArray();
        char[] T = (sc.nextLine()).toCharArray();
        int ans = 0;
        for (int i=0;i<3;i++){
            if (S[i] == T[i]) ans++;
        }
        System.out.printf("%d\n",ans);
        
    }
}
