
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int N= scan.nextInt();
        int A[] = new int[N];
int B[]=new int[N];

int i2=0;

while (i2<N)
{A[i2]=0;
i2=i2+1;
}
int i1=1;

 while(i1<N){
     B[i1]=scan.nextInt()-1;
     i1=i1+1;

 }
        int i=1;
        while (i<N) { A[B[i]]=A[B[i]]+1;
        i=i+1;


        }
int i3=0;
while (i3<N){System.out.println(A[i3]);
i3=i3+1;

}


    }
}