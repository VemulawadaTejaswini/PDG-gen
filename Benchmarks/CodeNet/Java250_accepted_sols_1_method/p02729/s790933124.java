import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nArray = new int[n];
        int[] mArray = new int[m];

        for(int i=1;i<=n; i++) {
            nArray[i-1] = i*2;
        }
        for(int i=0;i<m; i++) {
            if(i==0) {
                mArray[i] = 1;
            } else {
                mArray[i] = n*2+1;
            }
        }
        int count=0;
        int[] array = new int[n+m];
        System.arraycopy(nArray, 0, array, 0, n);
        System.arraycopy(mArray, 0, array, n, m);

        for(int i=0;i<array.length ;i++) {
            for(int j=i+1; j<array.length; j++) {
                if((array[i]+ array[j])%2==0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
