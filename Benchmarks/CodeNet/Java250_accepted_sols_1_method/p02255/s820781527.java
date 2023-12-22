
import java.util.Scanner;

/**
 * Created by sd on 2016/11/22.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int I=0;I<N;I++){
            a[I] = sc.nextInt();
        }


        for(int ii=0; ii<N-1; ii++){
            System.out.print(a[ii]+" ");
        }
        System.out.println(a[N-1]);
        for(int i=1; i<N; i++){
            int v = a[i], j=i-1;
            while(j>=0 && a[j]>v){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = v;
            for(int ii=0; ii<N-1; ii++){
                System.out.print(a[ii]+" ");
            }
            System.out.println(a[N-1]);
        }
    }
}