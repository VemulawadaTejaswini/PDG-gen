import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
int N= scan.nextInt();
        int K= scan.nextInt();
        int A[]= new int[N];
int i=0;

        while (i<K){int D=scan.nextInt();
            int i1=0;

            while(i1<D){
                int i4=scan.nextInt()-1;

                A[i4]=A[i4]+1;
            i1=i1+1;


            }
            i=i+1;


        }
        int i2=0;
        int i3=0;

        while (i2<N){
            if(A[i2]==0){i3=i3+1;};
            i2=i2+1;

        }

System.out.println(i3);
    }
}
