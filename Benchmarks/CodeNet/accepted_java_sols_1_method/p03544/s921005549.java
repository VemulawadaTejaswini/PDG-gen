
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = 0;

    if(n == 1){ans = 1;}
    else if(n == 2){ans = 3;}
    else{
      long a = 2;
      long b = 1;
      long c = 3;
      for(int i = 0; i < n-2; i++){
        a = b;
        b = c;
        c = a + b;
        ans = a + b;
      }
    }

      System.out.println(ans);

  }
}

/*
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String blank = sc.nextLine();
String s = sc.nextLine();
System.out.println();
System.exit(0)
*/
