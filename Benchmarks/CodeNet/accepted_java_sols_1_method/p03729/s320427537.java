import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        int la = A.length();
        String B = sc.next();
        int lb = B.length();
        String C = sc.next();
        int lc = C.length();

        if(A.charAt(la-1)==B.charAt(0) && B.charAt(lb-1)==C.charAt(0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}