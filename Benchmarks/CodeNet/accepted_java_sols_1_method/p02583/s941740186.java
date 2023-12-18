
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        long[] l = new long[N];
        for(int i=0;i<N;i++){
            l[i] = sc.nextLong();
        }
        int count = 0;
        for(int a=0;a<N;a++){
            if(a >= N-2)
                break;
            for(int b=a+1;b<N;b++){
                if(b >= N-1)
                    break;
                for(int c=b+1;c<N;c++){
                    if(l[a] != l[b] && l[b] != l[c] && l[c] != l[a]) {
                        if (l[a] < l[b] + l[c] && l[b] < l[c] + l[a] && l[c] < l[a] + l[b]) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
