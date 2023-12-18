import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
       int A[]=new int[N];
       int k=0;
       int m=1000;
for(int i=0;i<N;i++){A[i]=scan.nextInt();}
for(int i=0;i<N-1;i++){
    if(k>0&&A[i]>A[i+1]){
        m=m+k*A[i];
        k=0;
    }


    if (k==0&&A[i]<A[i+1]){
        k=m/A[i];
        m=m%A[i];
    }

}
        m=m+k*A[N-1];

        System.out.println(m);


  }

}

