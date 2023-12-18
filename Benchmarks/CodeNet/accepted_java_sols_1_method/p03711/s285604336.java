import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int ga = 0;
          int gb = 0;
          if(a == 2){
            ga = 3;
          } else if(a == 4 || a == 6 || a == 9|| a == 11){
            ga = 2;
          } else {
            ga =1;
          }
          if(b == 2){
            gb = 3;
          } else if(b == 4 || b == 6 || b == 9|| b == 11){
            gb = 2;
          } else {
            gb =1;
          }
          if(ga == gb){
            System.out.println("Yes");
          } else {
            System.out.println("No");
          }
        }
      }