import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
int X=scan.nextInt();
        int N =scan.nextInt();


        int M[]=new int[N];
        int K=0;
        int Y=0;
        for(int i=0;i<N;i++) {M[i]=scan.nextInt();
        if (M[i]==X){K=1;
        Y=1;
        }}


      int P=X;
        int C=1;
            Arrays.sort(M);
        for(int i=0;i<N&&K==1&&C==1;i++){ C=0;
            K=0;
        for(int j=N-1;j>=0&&K==0;j--) {
            if (M[j] == X +i) {
             C= 1;
             P=M[j];
            }

            if (M[j] == X -i) {
                K = 1;
                P = M[j];
            }
        }

        }
        if (P>X&&Y==1&&C==0){System.out.println(2*X-P-1);}
        if (P>X&&Y==1&&C==1){System.out.println(2*X-P);}
        if (P<X&&Y==1&&K==0){System.out.println(P-1);}
        if (P<X&&Y==1&&K==1&&C==0){System.out.println(2*X-P);}
    
        if (P==X&&Y==1){System.out.println(P-1);}
        if (Y==0){System.out.println(X);}




    }
    }




