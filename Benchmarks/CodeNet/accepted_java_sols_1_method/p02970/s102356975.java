import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int d = sc.nextInt();
      int target =0;

      if(n<d){
        System.out.println(1);
        System.exit(0);
      }

      for (int i = 1;i<=n ;i++ ) {
        if(i-d==1){
          target = i+d;
        }
      }
      if(n%target!=0){
        System.out.println(n/target+1);
      }else{
        System.out.println(n/target);
      }

  }
}
