import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] c = S.toCharArray();
        Arrays.sort(c);
        String ans = "";
        if(c[0] == c[1] && c[2] == c[3] && c[0] != c[2])    ans = "Yes";
        else    ans = "No";
        
        System.out.print(ans);
    }
}