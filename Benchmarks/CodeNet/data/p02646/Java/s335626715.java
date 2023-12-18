import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long a = sc.nextInt();
    int v = sc.nextInt();
    long b = sc.nextInt();
    int w = sc.nextInt();
    int t = sc.nextInt();

    long moveA = a + v * t;
    long moveB = b + w * t;
    System.out.println("A:"+moveA);
    System.out.println("B:"+moveB);
    if(moveA >= moveB){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }
}
