import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();

    char[] inArray = line.toCharArray();
    char tmp = inArray[0];
    String rtval = "Good";

    for(int i = 1; i < 4; i++) {
      if(tmp == inArray[i]){
        rtval = "Bad";
        break;
      }
      tmp = inArray[i];
    }

    System.out.println(rtval);
    sc.close();
  }
}