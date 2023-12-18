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
    int m = scan.nextInt(),j = 0,rec = 0;
    int q[] = new int[m];
    for(int i=0;i<m;i++){
      q[i] = scan.nextInt();
    }
    Arrays.sort(q);
    for(int i=0;i<m;i++){
      for(;j<n;j++){
        if(ary[j] == q[i]){
          j++;
          rec++;
          break;
        }else if(ary[j] > q[i]) break;
      }
    }
    out.println(rec);
  }
}