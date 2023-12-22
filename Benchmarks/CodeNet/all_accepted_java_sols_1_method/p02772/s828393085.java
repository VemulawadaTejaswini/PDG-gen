
import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i, j;
        n = s.nextInt();
        int[] a = new int[n];
        for (j = 0; j < n; j++) {
            a[j] = s.nextInt();
        }

        int flag = 1;
        for (j = 0; j < n; j++){
            if ((a[j] % 2 == 0)) {
                if (a[j] % 3 == 0 || a[j] % 5 == 0) {
                    flag = 1;
                }
                else
                {
                    flag=0;
                    break;
                }

            }}

        if (flag == 0) {
            System.out.println("DENIED");

        }
        else{
            System.out.println("APPROVED");}
    }
}
