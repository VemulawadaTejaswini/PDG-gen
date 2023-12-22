import java.util.* ;

public class Main{
  public static void main(String args[]){
       	Scanner sc = new Scanner(System.in);
    
    int K = sc.nextInt() ;
    int X = sc.nextInt() ;
      int kanousei = X + K-1 ;
      int kanouseiminus = X-K+1 ;
      for(int i=kanouseiminus;i<=kanousei;i++){
        System.out.print(i + " ");
    }
  }
}