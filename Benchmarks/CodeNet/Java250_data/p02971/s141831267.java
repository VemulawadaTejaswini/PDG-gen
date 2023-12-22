import java.io.PrintWriter;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    final long mod = 1000000000+7;
    ArrayList<Integer>[] tree;
    long ans = 1;
    int n,k;
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int maxVal = -1, maxKey = -1;
        for(int i=0;i<n;i++){
            if(a[i]>maxVal){
                maxVal = a[i];
                maxKey = i;
            }
        }
        int secondVal = -1;
        for(int i=0;i<n;i++){
            if(i==maxKey) continue;
            secondVal = Math.max(a[i],secondVal);
        }
        for(int i=0;i<n;i++){
            if(i!=maxKey) out.println(maxVal);
            else out.println(secondVal);
        }
        out.flush();
        System.exit(0);
        return 0;
    }
}