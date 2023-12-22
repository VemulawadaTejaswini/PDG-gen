import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long K = sc.nextInt();
        long ans = 1;
      
      if(N<=1){System.out.print(K);}
      else{
        for(int i = 0; i<N-1 ;i++){
        ans *=K-1;  
        }
        System.out.print(K*ans);
      }

      
    }
}