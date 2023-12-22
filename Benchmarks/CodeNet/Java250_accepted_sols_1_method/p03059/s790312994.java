import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int sam = 0;
      
      for(int i=1;i<T+1;i++){
       if(A*i<=T){
         sam += B;
       }
      }

      System.out.print(sam);


    }
}