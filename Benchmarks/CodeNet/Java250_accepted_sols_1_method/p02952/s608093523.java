import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int Ans = 0;
      if(N<10) {
    	  Ans = N;
      }
      else if(N<100) {
    	  Ans = 9;
      }
      else if(N<1000) {
    	  Ans = N -100 +10;
      }
      else if(N<10000) {
    	  Ans = 900 + 9;
      }
      else if(N<100000) {
    	  Ans = N-10000 + 910;
      }else {
    	  Ans = 90909;
      }
      System.out.println(Ans);
  }
}