import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();
    int ab =p+q;
    int bc = q+r;
    int ca = r+p;
    System.out.print(Math.min(ab,Math.min(bc,ca)));
  }
}
