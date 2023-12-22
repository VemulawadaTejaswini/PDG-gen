import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
  
		int a = sc.nextInt();
		int b = sc.nextInt();
      int c = 0;
      boolean hit = false;
      for(int i = a;i<=b;i++){
         if(i%k==0){
            hit = true;
         }
      }
      if(hit){
         System.out.println("OK");
      }else{
         System.out.println("NG");
      }
   }
}