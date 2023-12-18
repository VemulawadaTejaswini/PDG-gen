import java.util.*;
import java.util.Arrays.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] p = new int[N];
        int result = 0;
        for(int i=0;i<N;i++){
            p[i] = scan.nextInt();
        }
        Arrays.sort(p);
        for(int i=0;i<K;i++){
            result += p[i];
        }

        System.out.println(result);
    }
}