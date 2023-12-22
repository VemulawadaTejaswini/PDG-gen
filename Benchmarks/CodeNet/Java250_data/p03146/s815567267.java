import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int N = 1000000;
        int[] a = new int[N];
        a[0] = s;

        loop:for(int i=1; i<N; i++){
            if(a[i-1]%2==0){
                a[i] = a[i-1] / 2;
            }
            else if(a[i-1]%2!=0){
                a[i] = 3 * a[i - 1] + 1;
            }
            for(int j=0; j<i; j++){
                if(a[j]==a[i]){
                    System.out.println(i + 1);
                    break loop;
                }
            }
        }

    }
}