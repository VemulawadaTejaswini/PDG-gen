import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean check = true;
    for(int a = 1; a < 10; a++ ){
      for( int b = 1; b < 10; b++) {
        if( (a * b)== N ) {
          check = false;
        }
      }
    }
    if(check) {
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
    
  }
}
