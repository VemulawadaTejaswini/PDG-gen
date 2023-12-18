import java.util.*;


class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }

        Arrays.sort(p);
        int K = p[n/2] - p[n/2-1];
        System.out.println(K);
    }
}