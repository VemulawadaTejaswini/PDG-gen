import java.util.Scanner; 
import java.util.Arrays; 
import java.util.Collections; 
public class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
      int i,p=0;
      for(i=a;i<=b;i++){
          if(c % i == 0) p++;
      }
     System.out.println(p);
    sc.close();
  }
}
