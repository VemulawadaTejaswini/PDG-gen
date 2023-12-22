import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = String.valueOf(n);
    int aa = s.length();
    int[] a = new int[aa];
    int ss = 0;
    for(int i = 0;i<aa;i++){
      a[i] = Integer.parseInt(s.substring(i,i+1));
      ss += a[i];
    }
    if(n % ss == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
