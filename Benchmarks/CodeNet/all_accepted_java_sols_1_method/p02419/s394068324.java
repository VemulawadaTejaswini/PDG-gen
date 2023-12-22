import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    String w = sc.nextLine();
    while(true) {
      String[] str = sc.nextLine().split(" ");
      if(str[0].equals("END_OF_TEXT")) {
        break;
      } else {
        for(int i = 0; i < str.length; i++) {
          if(str[i].toLowerCase().equals(w)) {
            count++;
          }
        }
      }
    }
    sc.close();
    System.out.println(count);
  }
}

