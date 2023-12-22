import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         StringBuffer sb = new StringBuffer();
         Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
         String S = sc.next();

         for(int i = 0;i<S.length();i++){
             char c = S.charAt(i);
             c = (char)((int)'A'+((int)c-(int)'A'+N)%26);
             sb.append(c);
         }
         System.out.println(sb);
    }
}
