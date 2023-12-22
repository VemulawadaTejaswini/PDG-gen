import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        int ans = 0;
        Boolean chk = true;
        Arrays.sort(a);
        int min = a[0];
        while (min != 0 && chk) {
            for(int i = 0; i < n; i++){
                if(a[i] % 2 == 0)
                    a[i] /= 2;
                else
                    chk = false;
            }
            ans++;
        }

        System.out.println(ans-1);
    }
}
