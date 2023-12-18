import java.util.*;
class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int testCase = 1;
  while(sc.hasNext()){
   int x = sc.nextInt();
  if( x > 0 ) {
   System.out.println( "Case " + testCase + ": " + x );
   testCase++;
  } else {
    break;
  }
 }
}
}
    
