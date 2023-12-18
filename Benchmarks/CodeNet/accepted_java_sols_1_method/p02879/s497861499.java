  import java.util.Scanner;
     
    public class Main { //クラス名はMain
        public static void main(String[] args) {
            //コード
          Scanner sc = new Scanner(System.in);
    	  String n = sc.nextLine();
          String[] strArray = n.split(" ");
          int a = Integer.parseInt(strArray[0]);
          int b = Integer.parseInt(strArray[1]);
          int c = -1;
          
          //九九判定
          if (a >= 10 || b >= 10) {
            System.out.println(c);
          }
          if (a < 10 && b < 10) {
            System.out.println(a*b);
          }
        }
    }