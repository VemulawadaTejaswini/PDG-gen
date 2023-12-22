import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        StringBuilder A = new StringBuilder(N);
        StringBuilder B = new StringBuilder(N);
        StringBuilder C = new StringBuilder(N);
        A.append(sc.next());
        B.append(sc.next());
        C.append(sc.next());
        sc.close();
        
        int cnt = 0;
        for (int i=0; i<N; i++) {
            if (A.charAt(i)==B.charAt(i) & A.charAt(i)==C.charAt(i)) {
                //non
            } else if (A.charAt(i)!=B.charAt(i) & A.charAt(i)!=C.charAt(i) & B.charAt(i)!=C.charAt(i)) {
                cnt+=2;
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}