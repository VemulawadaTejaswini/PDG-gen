import java.util.*;

public class Main{
	public static void main(String[] args) {
     
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      
      if (n%2==1){
        if (k>n/2+1)System.out.println("NO");
        else System.out.println("YES");
      }
      else if (k>n/2)System.out.println("NO");
      else System.out.println("YES");
      return;
    }
}
