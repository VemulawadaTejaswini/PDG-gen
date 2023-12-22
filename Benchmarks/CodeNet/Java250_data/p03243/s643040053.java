import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    char ch[] = String.valueOf(N).toCharArray();
    char x = ch[0];
    char ans[] = {x,x,x};
    int di = Integer.parseInt(String.valueOf(ans));
    if(di>=N){
      System.out.println(di);
    }else{
      di+=111;
      System.out.println(di);
    }
  }
}