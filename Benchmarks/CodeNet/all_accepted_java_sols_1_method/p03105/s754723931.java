import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int sum = 0;

      if(A*C<=B){
        System.out.println(C);
      }else{
        for(int i = 1;i*A<=B;i++){
          sum++;
        }
          System.out.println(sum);
      }
  }
}
