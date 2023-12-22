import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = 0;
    if (a==1) {
      if (b==2) {
        c = 3;
      }
      else {
        c = 2; 
      }
    }
    else if (a == 2) {
      if (b==1) {
        c = 3;
      }
      else {
        c = 1; 
      }
    }
    else {
      if (b==2) {
        c = 1;
      }
      else {
        c = 2; 
      }
    }
    System.out.println(c);
  }
}
