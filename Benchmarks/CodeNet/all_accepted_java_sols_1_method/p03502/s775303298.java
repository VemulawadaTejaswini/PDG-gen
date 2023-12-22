import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nn = n;
    int fx = 0;
    while(n>0){
      fx += n - (n/10)*10;
      n = n / 10;
    }
    if(nn % fx == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
