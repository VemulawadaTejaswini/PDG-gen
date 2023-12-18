import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true){
      String str = sc.next();
      if(str.equals("-")) break;

      int m=sc.nextInt();

      for (int i=0; i<m; i++) {
        int l = sc.nextInt();
        str = str.substring(l) + str.substring(0, l);
      }
      System.out.printf("%s\n", str);
    }

  }
}

