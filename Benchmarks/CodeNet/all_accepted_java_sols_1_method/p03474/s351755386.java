import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String S = sc.next();
        String ans = "No";
        sc.close();
        try {
            Integer.parseInt(S.substring(0,A));
            Integer.parseInt(S.substring(A+1));
            if (S.length() == A+B+1){
                if (S.charAt(A) == '-'){
                    ans = "Yes";
                }
            }
        }
        catch(NumberFormatException e){
        }
        System.out.println(ans);
    }
}