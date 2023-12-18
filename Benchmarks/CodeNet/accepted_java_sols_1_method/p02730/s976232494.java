import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int L = s.length();
        String A = s.substring(0, L/2);
        String A2 = s.substring(((L+3)/2)-1, L);
        if(A.equals(A2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
