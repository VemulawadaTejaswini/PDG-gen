import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        boolean[] isCorrect = new boolean[N];
        int correct = 0;
        int wa = 0;
        int wrong[] = new int[N];
        for(int i = 0; i < M; i++){
            int p = scan.nextInt()-1;
            String str = scan.next();
            if(isCorrect[p]) continue;
            if(str.equals("AC")){
                isCorrect[p] = true;
                correct++;
                wa += wrong[p];
            } else {
                wrong[p]++;
            }
        }
        os.println(correct + " " + wa);
    }
}