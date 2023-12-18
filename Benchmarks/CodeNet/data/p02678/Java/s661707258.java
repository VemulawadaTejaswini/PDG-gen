import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M+1];
        int[] B = new int[M+1];
        for(int i=1;i<=M;i++){
          A[i]=sc.nextInt();
          B[i]=sc.nextInt();
        }
      
      int[] group = new int[M+1];
      int[] arrow = new int[M+1];
      group[1]=1;
      
      for(int gr=1; gr<=M ;gr++){
        for(int i=1;i<M+1;i++){
          if(group[i]==gr){
            for(int j=1;j<=M;j++){
              if(A[j]==i&&group[B[j]]==0) {
                group[B[j]]=gr+1;
                arrow[B[j]]=i;
              }else if(B[j]==i&&group[A[j]]==0) {
                group[A[j]]=gr+1;
                arrow[A[j]]=i;
              }
            }
          }
        }
      }
      for(int i=1;i<=N;i++){
        if(group[i]==0){
          System.out.println("No");
          return;
        }
      }
      
      System.out.println("Yes");
      for(int i=2; i<=N;i++){
        System.out.println(arrow[i]);
      }
            
      
	}
  
      
}