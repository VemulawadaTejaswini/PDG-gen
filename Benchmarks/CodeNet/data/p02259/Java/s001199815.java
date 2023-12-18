

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

        int count = 0;
        boolean flag = true;
        while (flag){
            flag = false;
            for (int j=N-1; j>=1; j--){
                if(a[j] < a[j-1]){
                    int t = a[j];
                    a[j] = a[j-1];
                    a[j-1] = t;
                    flag = true;
                    count ++;
                }
            }
        }
        for(int ii=0; ii<N-1; ii++){
            System.out.print(a[ii]+" ");
        }
        System.out.println(a[N-1]);
        System.out.println(count);
    }
}