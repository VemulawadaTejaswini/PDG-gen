import java.util.Scanner;


class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   long N = sc.nextLong();
   long[] A = new long[N];
   long sum=1;
   for(int i=0;i<N;i++){
   	long A[i] = sc.nextLong();
   }

   for(int j=0;j<N;j++){
   sum*=A[j];
     if(sum>Math.pow(10, 18)){
      sum=-1;
       break;
     }
   }
 System.out.println(sum);
 }
}

