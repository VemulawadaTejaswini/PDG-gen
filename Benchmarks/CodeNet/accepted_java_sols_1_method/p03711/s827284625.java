import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int[] a = {0,1,2,1,4,1,4,1,1,4,1,4,1};
    int x = sc.nextInt();
    int y = sc.nextInt();
    System.out.println( (a[x]==a[y]?"Yes":"No") );
  }
}