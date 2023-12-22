import java.util.Scanner;	//・・・①
import java.util.Arrays;
public class Main {
  public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);	//・・・②
        // System.out.println("何か入力してください。");
        int N = scanner.nextInt();	//・・・③
        // System.out.println("入力した文字列は " + string + " です。");
        int K = scanner.nextInt();
        // int int3 = scanner.nextInt();
        int[] p = new int[N];
        // ArrayList<Integer> foo = new ArrayList<>();

        for(int i=0; i<N; i++){
            p[i] = scanner.nextInt();
            
        }
        Arrays.sort(p);
        int sum=0;
        for(int j=0;j<K;j++){
            sum += p[j];
        }
        System.out.println(sum);

        
  }
}