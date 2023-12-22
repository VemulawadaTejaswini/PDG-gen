
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int bigger ;
        int a[] = new int[N];
        int i,j,k,x ;
        int count =0;
        for (x =0 ; x < N ; x++){
            a[x] = sc.nextInt();
        }
        for (i = 0; a.length > i;i++ ){
            for(j=N-1;j>=i+1;j--){
                if(a[j] <a[j-1]){
                    bigger = a[j-1];
                    a[j-1] = a[j];
                    a[j] = bigger;
                    count++;
                }
            }
        }
        for(k=0; k<N-1;k++){
            System.out.print(a[k]+ " ");
        }
        if(k == N-1){
            System.out.println(a[k]);
        }
        System.out.println(count);
    }

}