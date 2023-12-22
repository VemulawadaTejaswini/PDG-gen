import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      int N =sc.nextInt();
 
      //偶数を見つけだす
      for(int i=0;i<N;i++){
        int A =sc.nextInt();
        if(A % 2==0){
 
        //3か5で割り切れるか
         if(A%3!=0&&A%5!=0){
           System.out.print("DENIED");
           
           return;
        }
        }
      }
           System.out.print("APPROVED");
 }
}