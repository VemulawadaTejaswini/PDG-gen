import java.util.Scanner;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
      Scanner sc = new Scanner(System.in);
	  String n = sc.next();
      switch (n) {
        case "SUN":
            System.out.println(7-0);
            break;
        case "MON":
            System.out.println(7-1);
            break;
        case "TUE":
            System.out.println(7-2);
            break;
        case "WED":
            System.out.println(7-3);
            break;
        case "THU":
            System.out.println(7-4);
            break;
        case "FRI":
            System.out.println(7-5);
            break;
        case "SAT":
            System.out.println(7-6);
            break;
      }
    }
}