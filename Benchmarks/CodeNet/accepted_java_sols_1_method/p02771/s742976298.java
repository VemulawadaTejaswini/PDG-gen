import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int A = st.nextInt();
        int B = st.nextInt();
        int C = st.nextInt();
        st.close();
 
        if (A == B && B != C) {
            System.out.println("Yes");
        } else if(A == C && B != C) {
            System.out.println("Yes");
        } else if(B == C && A != C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}