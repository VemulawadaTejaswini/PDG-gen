import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        Integer Q = sc.nextInt();
        String S = sc.next();

        Integer[] l = new Integer[Q], r = new Integer[Q];
        for(int i = 0; i < Q; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        int[] a = new int[N];
        int count = 0;
        for(int i = 1; i < N; i++){
            if(S.charAt(i-1) == 'A' && S.charAt(i) == 'C'){
                count++;
                a[i] = count;
            } else {
                a[i] = count;
            }
        }

        for(int i = 0; i < Q; i++){
            System.out.println(a[r[i]-1] - a[l[i]-1]);
        }

    }
}