import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int k=scn.nextInt();
      int a=scn.nextInt();
      int b=scn.nextInt();
      for(;a<=b;a++){
          if(a%k==0){
            System.out.printf("OK\n");
            return;
          }
      }
      System.out.printf("NG\n");
    }
}
