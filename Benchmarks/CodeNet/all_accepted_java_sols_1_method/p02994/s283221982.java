import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
      int L =sc.nextInt();
      
     
      int at[] =new int[N];
      int pt[] =new int[N];
      int tt =0;
      for(int i=0; i<N; i++){
        at[i] =L+i;
        tt +=at[i];
      }

      for(int i=0; i<N; i++){
        pt[i] =tt-at[i];
      }
      int diff =1000000;
      int ans =0;
        
      for(int i=0; i<N; i++){
        int d0 =Math.abs(tt-pt[i]);
        if(diff>d0){
        diff =d0;
        ans=pt[i];
        }
        
      }
      System.out.println(ans);
    }
}