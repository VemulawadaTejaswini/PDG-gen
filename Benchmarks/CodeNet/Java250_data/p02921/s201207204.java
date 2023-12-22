import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        String T = scan.nextLine();
        char[] yohou = S.toCharArray();
        char[] tenki = T.toCharArray();
        int ans=0;
        for(int i=0;i<3;i++) {
            if(yohou[i]==tenki[i]){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
