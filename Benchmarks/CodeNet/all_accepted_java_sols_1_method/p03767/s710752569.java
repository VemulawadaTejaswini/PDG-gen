import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N*3];

        for(int i=0;i<N*3;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        for(int i=0;i<N*3;i++){
         //   System.out.print(a[i]);
        }
      //  System.out.print("\n");

        long sum = 0;
        for(int i=N;i<N*3;i+=2){
           // System.out.print(a[i]);

            sum += a[i];
        }

        System.out.print(sum);
    }

}