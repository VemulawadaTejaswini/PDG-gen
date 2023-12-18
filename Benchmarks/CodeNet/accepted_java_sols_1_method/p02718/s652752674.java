import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int N=sc.nextInt();
      int M=sc.nextInt();
      System.out.println();
      int A[]=new int[N];
      int cnt=0;
      int total=0;
      for(int i=0;i<N;i++){
         A[i]=sc.nextInt();
         total+=A[i];
      }
      for(int j=0;j<N;j++){
         if(A[j]>=(float)total/(4*M)){
            cnt++;
         }
      }
      if(cnt>=M){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }
   }
}
