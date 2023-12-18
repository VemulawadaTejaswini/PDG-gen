import java.util.Scanner;

public class Main {
    public static void main(final String args[]) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String T = scan.next();
        for(int i = 0;i < S.length();i++){
            if(S.charAt(i) != T.charAt(i)){
                System.out.println("No");
                break;
            }else if((i == S.length() - 1)&&(S.length() == T.length() -1 )){
                System.out.println("Yes");
            }else if(S.length() == T.length()){
                System.out.println("No");
            }
        }
    }
}