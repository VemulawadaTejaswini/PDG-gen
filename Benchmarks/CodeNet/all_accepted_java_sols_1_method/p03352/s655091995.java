import java.util.*;
import java.lang.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int MAX_ROOT = (int)Math.sqrt(x);
    double e = 1;
    double max = e;
    for(int i = 2;i <= MAX_ROOT;i++){
      for(int j = 1;j <= 9;j++){
        e = Math.pow(i,j);
        if(e > x) break;
        if(max < e){
          max = e;
        }
      }
    }
    int emax = (int)max;
    System.out.println(emax);
  }
}