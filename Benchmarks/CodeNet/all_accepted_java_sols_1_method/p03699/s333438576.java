import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int sum = 0;
        for(int i = 0; i<N; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        if(sum%10 != 0) {
            System.out.println(sum);
            return;
        }
        Arrays.sort(a);
        int sumc = sum;
        for(int i = 0; i<N; i++) {
            if(a[i] %10==0) continue;
            sumc = sum-a[i];
            if(sumc%10 !=0) break;
        }
        if(sumc == sum) {
            System.out.println(0);
            return;
        }
        System.out.println(sumc);
    }
}