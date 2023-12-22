import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());

      /*
      int[] a = new int[n];
      for(int i=0;i<n;i++){
        a[i] = Integer.parseInt(sc.next());
      }
	  */
      
      int ans;
      
      if(a>12){ans=b;}
      else if(a<6){ans=0;}
      else{ans=b/2;}
      System.out.println(ans);

    }
}
