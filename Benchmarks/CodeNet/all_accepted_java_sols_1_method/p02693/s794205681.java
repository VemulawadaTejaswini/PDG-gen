import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int K=sc.nextInt();
      int A=sc.nextInt();
      int B=sc.nextInt();
      boolean H=false;
      while(B>=A){
         if(B%K==0){
            H=true;
         }
         B--;
      }
      if(H==true){
         System.out.println("OK");
      }else{
         System.out.println("NG");
      }
   }
}
