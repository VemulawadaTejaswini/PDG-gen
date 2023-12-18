import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();

    for (;A>B && K!=0; K--){
      B += B;
    }
    
    for (;B>C && K!=0; K--){
      C += C;
    }
    
    if(K != 0)
      System.out.println("Yes");
    else
      System.out.println("No");
    
    sc.close();
  }
}
