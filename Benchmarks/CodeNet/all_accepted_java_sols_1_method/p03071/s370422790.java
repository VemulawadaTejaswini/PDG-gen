import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

      if(A>B){
        int ans = A+(A-1);
	System.out.println(ans);
      }else if(A<B){
        int ans = B+(B-1);
	System.out.println(ans);  
      }else{
        int ans = A+B;
	System.out.println(ans);        
      }
      }
}