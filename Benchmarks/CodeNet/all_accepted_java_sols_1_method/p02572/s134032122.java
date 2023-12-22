import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
int N=scan.nextInt();
   long A[]=new long[N];
        long B[]=new long[N];

   for(int i=0;i<N;i++){A[i]=scan.nextLong();}
long M=0;
        B[0]=A[0];
   for(int i=1;i<N;i++){
       B[i]=B[i-1]+A[i];
       B[i]=B[i]%1000000007;
   }
   for(int i=0;i<N-1;i++){M=M+A[i+1]*B[i];
   M=M%1000000007;}
System.out.println(M);
        }

}
