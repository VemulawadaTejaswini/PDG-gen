import java.util.*;
class Main {
  public static void main(String[] args)  {
      Scanner scan_ = new Scanner(System.in);
      int a_ = scan_.nextInt();
      int b_ = scan_.nextInt();
      int c_ = scan_.nextInt();
      int count_ = 0;
      for( ; a_ <= b_ ; a_++ ) {
          if( c_ % a_  == 0 ) {
              count_++;
          }
        
      }
      System.out.println(count_);
  }
}
