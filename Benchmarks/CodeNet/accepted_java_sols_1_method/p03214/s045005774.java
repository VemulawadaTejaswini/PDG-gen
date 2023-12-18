import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        int N = sc.nextInt();
        int[] a = new int[N];
        double sum = 0;
        double ans = 101;
        int I = 0;
        //char[] c = str.toCharArray();
        //char[] W = {'x',' ','x',' ','x',' ','x'};
        for(int i = 0; i<N; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        sum /= N;
        for(int i = 0; i<N; i++){
            if(ans > Math.abs(a[i]-sum)){
                ans = Math.abs(a[i]-sum);
                I = i;
            }
        }
        System.out.println(I);
    }
}
