import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        String [] S = new String [N];
        for(int i=0; i<N; i++){
            S[i] = sc.next();
        }
        Arrays.sort(S);
        String ans="";
        for(int i=0; i<N; i++){
            ans=ans+S[i];
        }
        System.out.println(ans);
    }
}