import java.util.*;

public class Main {
    public static void main(String[] args) {
        int ai,bj;
        Scanner sc = new Scanner(System.in);
        ai = sc.nextInt();
        int[] a = new int[100000];
        for(int i = 0;i < ai; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        bj = sc.nextInt();
        int[] b = new int[100000];
        for(int j = 0;j < bj; j++) {
            b[j] = sc.nextInt();
            for(int i = 0; i < ai; i++)
                if(a[i] == b[j])
                    count++;
        }
        System.out.println(count);

    }
}

