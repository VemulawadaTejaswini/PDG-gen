import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int emax = ( (n-1)*(n-2) )/2;
        if( k>emax ) {
            System.out.println(-1);
            return;
        }
        System.out.println( (n-1) + emax - k );
        for( int i=1; i<n; i++ ){
            System.out.printf("%d %d\n",i,n);
        }
        int e1= 1;
        int e2= 2;
        for( int i=0; i<emax-k; i++){
            System.out.printf("%d %d\n",e1, e2);
            if(e2==n-1) {
                e1+=1;
                e2=e1+1;
            } else {
                e2++;
            }
        }
    }
}
