import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();


      if (a==1&&c==2||a==3&&c==4||a==5&&c==6||a==7&&c==8||a==8&&c==9||a==10&&c==11||a==12&&c==1) {
        if(b==31&&d==1){
          System.out.println(1);
          System.exit(0);
        }
      }

      if (a==2&&c==3||a==4&&c==5||a==6&&c==7||a==9&&c==10||a==11&&c==12) {
        if (b==30&&d==1) {
          System.out.println(1);
          System.exit(0);
        }
      }
      if(a==2&&c==3){
        if(b==28&&d==1){
          System.out.println(1);
          System.exit(0);
        }
      }
      System.out.println(0);
  }
}
