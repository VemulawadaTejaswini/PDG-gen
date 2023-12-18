import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int N=scan.nextInt();
int  A[]=new int [N] ;
int  B[]=new int [N];

for(int i=0;i<N;i++){
    A[i]=scan.nextInt();
    B[i]=scan.nextInt();
}
int M=0;
for(int i=0;i<N;i++){
    for(int j=0;j<i;j++){
        if(M<Math.abs(A[i]-A[j])+Math.abs(B[i]-B[j])){M=Math.abs(A[i]-A[j])+Math.abs(B[i]-B[j]);}

    }

}
System.out.println(M);

    }
}

