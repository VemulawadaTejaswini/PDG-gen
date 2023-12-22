import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String S = sc.next();
        String s[] = S.split("");
        String ans="";
        if(S.length()<=K)
        {
            System.out.println(S);
        }
        else
        {
            for(int i=0;i<K;i++)
            {
                ans += s[i];
            }
            System.out.println(ans+"...");
        }
    }
}
