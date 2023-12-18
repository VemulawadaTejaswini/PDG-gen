import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int v = sc.nextInt();
    int b = sc.nextInt();
    int w = sc.nextInt();
    int t = sc.nextInt();

    int A=0, B=0;
    boolean x = false;
    for(int i=0; i<=t; i++){
      A = a + v * i;
      B = b + w * i;
      if(A == B){
        x = true;
      }
    }
    if(x){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }
}
