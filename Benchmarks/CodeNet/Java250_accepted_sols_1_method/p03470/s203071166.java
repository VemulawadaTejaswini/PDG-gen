import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        int[] a = new int[N];
        for(int i = 0 ; i < N ; i++) {
            a[i] = Integer.parseInt(stdR.readLine());
        }
        Arrays.sort(a);
        int count = 0;
        int num = 0;
        for(int i = 0 ; i < N ; i++) {
            if(num != a[i])count++;
            num = a[i];
        }
        System.out.println(count);
    }
}
