import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        //int c = sc.nextInt();
        //String s = sc.next();

        //int A[] = new int[M];
        int count = 0;
        int a;
        for(int i = 0;i<M;i++) {
            a = sc.nextInt();
            count += a;
        }
/*        if(N%2 != 0){
        for(int i = 1; i <= N; i++){
            for(int j = i; j <= N; j++){
                c = i*j;
                if(c == N){
                    d = i+j-2;
                    if(min == 0 || min > d) min = d;
            }
        }
    }
}*/
//double R = (double)r * Math.PI * 2;
count = N - count;
if(count < 0) System.out.println(-1);
else System.out.println(count);

    }
}