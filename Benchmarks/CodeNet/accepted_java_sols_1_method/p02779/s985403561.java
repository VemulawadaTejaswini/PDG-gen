import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String N = sc.next(); sc.nextLine();
    String Ast = sc.nextLine();
    String As[] = Ast.split(" ",0);
    int A[] = new int[As.length];
    for (int i=0;i<As.length;i++){
       A[i] = Integer.parseInt(As[i]);
    }
    Arrays.sort(A);
    String ans = "YES";
    for (int i=0;i<A.length-1;i++){
      if (A[i] == A[i+1]){
        ans = "NO";
        break;
      }
    }
    System.out.println(ans);
  }
}