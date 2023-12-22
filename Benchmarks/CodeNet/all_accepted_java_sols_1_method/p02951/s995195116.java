import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt(); 	
    int C = sc.nextInt(); 	     

      int x = A-B;
      int ans = C-x;
      if(ans>=0){
     System.out.println(ans);
      }else{
     System.out.println(0);        
}
    }
}