import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] sp = S.split("");
        int N = sp.length;
        
        String first = "";
        String last = "";
        
        for(int i = 0; i < (N-1)/2; i++) {
            first += sp[i];
        }
        for(int i = ((N+3)/2)-1; i < N; i++) {
            last += sp[i];
        }
        

        if(first.equals(last)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}