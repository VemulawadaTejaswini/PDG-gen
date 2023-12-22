import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int Max = 0;

    for(int b = 1; b <= Math.sqrt(x); b++){
      int max = 0;
      int p = 2;
      while(Math.pow((double)b, (double)p) <= x){
        if(b == 1){max = 1; break;}
        max = (int)Math.pow((double)b, (double)p);
        p++;
      }
      Max = Math.max(Max, max);
    }

    System.out.println(Max);

  }
}

/*

int n = sc.nextInt();
String blank = sc.nextLine();
String s = sc.nextLine();
System.out.println();
System.exit(0)
*/
