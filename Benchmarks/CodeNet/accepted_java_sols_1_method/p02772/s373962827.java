import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int N=sc.nextInt();
      int A[]=new int[N];
      int cnt1=0;
      int cnt2=0;
      System.out.println();
      for(int i=0;i<N;i++){
         A[i]=sc.nextInt();
         if(A[i]%2==0){
            cnt1++;
            if(A[i]%3==0||A[i]%5==0){
               cnt2++;
            }
         }
      }
      if(cnt1==cnt2){
         System.out.println("APPROVED");
      }else{
         System.out.println("DENIED");
      }
   }
}
