import java.util.Scanner;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
      Scanner sc = new Scanner(System.in);
	  String n = sc.next();
      switch (n) {
        case "Sunny":
            System.out.println("Cloudy");
            break;
        case "Cloudy":
            System.out.println("Rainy");
            break;
        case "Rainy":
            System.out.println("Sunny");
            break;
      }
    }
}