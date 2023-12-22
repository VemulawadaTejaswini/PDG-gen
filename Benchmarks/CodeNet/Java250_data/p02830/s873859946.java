
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //solve_148_A();
        solve_148_B();
      
        return;
    }

    private static void solve_148_B() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();

        String[] SArray = S.split("");
        String[] TArray = T.split("");
        String[] outputArray = new String[N*2];

        for(int i=0; i<N; i++){
            outputArray[i*2] = SArray[i];
            outputArray[i*2+1] = TArray[i];
        }
        String out = String.join("",outputArray);

        System.out.println(out);
    }
}