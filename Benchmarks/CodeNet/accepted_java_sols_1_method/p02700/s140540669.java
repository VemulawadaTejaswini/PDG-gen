import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());
    int D = Integer.parseInt(sc.next());

    while(true){
      if(C - B > 0){
        C = C -B;
        if(A - D > 0){
          A = A - D;
        }else{
          System.out.println("No");
          return;
        }
      }else{
        System.out.println("Yes");
        return;

      }
    }

  }
}

