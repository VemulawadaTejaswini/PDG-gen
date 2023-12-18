import java.util.*;

public class A {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] A = new int[n];
   int max = 0, min = 0; 
   for(int i = 0;i < n;i++){
      A[i] = sc.nextInt();
      if(i == 0) min = A[i];
      if(A[i] > max) max = A[i];
      else if(A[i] < max && A[i] < min) min = A[i]; 
   } 
   //int k = max -min + 1;
   int k = max;
   int[] B = new int[n];  
   int[] C = new int[k];

   for(int i = 0;i < k;i++) C[i] = 0;
   for(int j = 0;j < n;j++) C[A[j]]++;/*j = 1 to j = 0*/
   for(int i = 1;i < k;i++){
     C[i]+=C[i - 1];
   }
   for(int j = n - 1;j >= 0;j--){/*j > 0 to j>= 0 */
     B[C[A[j]] - 1] = A[j];
     C[A[j]]--;
   }
   StringBuilder sb = new StringBuilder();

   /*for(int i = 0;i < n - 1;i++){
      //System.out.print(B[i]);
      sb.append(B[i]);
    }
    for(int i = 0;i < n;i++){
      System.out.print(B[i]);
      if(i != n - 1) System.out.print(" ");
    }
   System.out.println();*/
   for(int i = 0;i < n - 1;i++){
    sb.append(B[i]+" ");
  }
  System.out.println(sb.append(B[n - 1]));
  }
}



