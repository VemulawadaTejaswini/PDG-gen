import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        int[] a = new int[N];
        int[] sorteda = new int[N];
        for(int i = 0 ; i < N ; i++) {
            a[i] = Integer.parseInt(stdR.readLine());
            sorteda[i] = a[i];
        }
        Arrays.sort(sorteda);
        for(int i = 0 ; i < N ; i++) {
            if(a[i] == sorteda[N - 1]) {
                System.out.println(sorteda[N - 2]);
            }else {
                System.out.println(sorteda[N - 1]);
            }
        }
    }
}