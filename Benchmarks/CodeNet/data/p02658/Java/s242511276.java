import java.util.Scanner;


class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] A = new int[N];
   long sum=1;
   for(int i=0;i<N;i++){
   	A[i] = sc.nextInt();
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

