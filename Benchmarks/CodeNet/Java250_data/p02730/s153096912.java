import java.io.*;
import java.util.*;


public class Main {
    public static boolean checkPalindrom(String S,int start, int end){
        boolean isPalindrome=true;
        for (int i=start,j=end;i<j;i++,j--){
            if (S.charAt(i)!=S.charAt(j)){
                isPalindrome=false;
                break;
            }
        }
        return isPalindrome;
    }
    public static void main (String[]args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();
        boolean isPalindrome1=true;
        boolean isPalindrome2=true;
        boolean isPalindrome3=true;
        isPalindrome1=checkPalindrom(S,0,N-1);
        isPalindrome2=checkPalindrom(S,0,((N-1)/2)-1);
        isPalindrome3=checkPalindrom(S,((((N+3)/2)))-1,N-1);
        System.out.println(isPalindrome1&&isPalindrome2&&isPalindrome3? "Yes":"No");
    }
}
