import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int A=sc.nextInt();
      int B=sc.nextInt();

      int C=A+B;

      int c=(A+B)/2;

      int ans=0;

      for(int k=0;k<=c;k++){
        if(C==2*k){
          ans=k;
        }
      }

      if(ans!=0){
        System.out.println(ans);
      }
      else{
        System.out.println("IMPOSSIBLE");
      }

    }
}
