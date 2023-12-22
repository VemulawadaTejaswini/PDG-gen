import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n, i;
    int pn, num;

    while (true){
      int m, p;
      m = p = 0;
      n = input.nextInt();
      if (n == 0) break;
      for (i = 0; i < n; i++){
        pn = input.nextInt();
        num = input.nextInt() + input.nextInt();
        
        if (num > m){
          m = num;
          p = pn;
        }
      }
      System.out.println(p + " " + m);
    }
  }
}