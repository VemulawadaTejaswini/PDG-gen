import java.util.Scanner;

class Main{
    static long gcm(long a, long b){
        if(b == 0)
            return a;
        return gcm(b, a % b);
    }

    static long gcmAll(int[] a) {
        long tmp = a[0];
        for(int i = 1; i < a.length; i++) {
            long b = gcm(tmp, a[i]);
            if(b == 1) return 1;
            else tmp = b;
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++)
        	a[i] = sc.nextInt();

        int f = 0;
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++) {
                if(i == j) continue;
                if(gcm(a[i], a[j]) != 1) {
                    if(gcmAll(a) == 1) {
                        System.out.println("setwise coprime");
                        i = N;
                        f = 1;
                        break;
                    }
                    else {
                        System.out.println("not coprime");
                        i = N;
                        f = 1;
                        break;
                    }
                }
            }

        if(f == 0) System.out.println("pairwise coprime");
    }

}
