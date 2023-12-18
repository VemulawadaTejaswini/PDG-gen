import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        long A = scan.nextInt();
        long B = scan.nextInt();
        long[] h = new long[N];
        for (int i = 0; i < N; i++) {
            h[i] = scan.nextLong();
        }

        long l = 0;
        long r = 1000000001;
        long m;
        while (r - 1 > l) {
            m = (l + r) / 2;
            long need = 0;
            //---------------------------//
            for(int i=0; i<N; i++){
                long tmp;
                tmp = h[i] - B*m; //
                if(tmp>0){
                    if(tmp%(A-B) == 0){
                        need += tmp/(A-B);
                    }else{
                        need += tmp/(A-B)+1;
                    }
                }
            }
            if(need > m){
                l=m;
            }else{
                r=m;
            }
            //----------------------------//
        }
        System.out.println(r);
    }
}