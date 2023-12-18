import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int ary[] = new int[n];
    for(int i=0;i<n;i++){
      ary[i] = scan.nextInt();
    }
    Arrays.sort(ary);
    for(int i=0;i<n;i++){
      if(i != 0) out.print(" ");
      out.print(ary[i]);
    }
    out.println();
  }
}