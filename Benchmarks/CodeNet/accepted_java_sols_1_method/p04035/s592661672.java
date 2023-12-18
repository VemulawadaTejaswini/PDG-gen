import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] a = new int[N];
        int[] s = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            if(i == 0)
                s[i] = a[i];
            else
                s[i] = s[i-1] + a[i];
        }
        sc.close();

        int last = 0;

        for(int i = 0; i < N-1; i++){
            if(a[i]+a[i+1] >= L){
                last = i+1;
                break;
            } else {
                if(i == N-2){
                    System.out.println("Impossible");
                    return;
                }
            }
        }
        System.out.println("Possible");
        for(int i = 1; i < last; i++){
            System.out.println(i);
        }
        for(int i = N-1; i >= last+1; i--){
            System.out.println(i);
        }
        System.out.println(last);
    }
}