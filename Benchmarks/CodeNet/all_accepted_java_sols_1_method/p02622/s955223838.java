import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String S = scan.nextLine();
        String T = scan.nextLine();

        int len = S.length();
        int ans = 0;

        for(int i = 0; i < len; i++){
            char charS = S.charAt(i);
            char charT = T.charAt(i);
            if(charS != charT){
                ans++;
            }
        }
        System.out.println(ans);
        scan.close();
    }
}
