import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
       int A[]=new int[N];
       int B[]=new int[N];
       int k=0;
       int m=1000;
for(int i=0;i<N;i++){A[i]=scan.nextInt();
B[i]=1000;}

for(int i=0;i<N;i++){
  if(i>0){  if (B[i]<B[i-1]){B[i]=B[i-1];}}
 for(int j=i+1;j<N;j++){
     int h=(B[i]/A[i]);
     h=h*A[j]+B[i]%A[i];
     if (B[j]<h){B[j]=h;}

 }
}
        Arrays.sort(B);
        System.out.println(B[N-1]);


  }

}
