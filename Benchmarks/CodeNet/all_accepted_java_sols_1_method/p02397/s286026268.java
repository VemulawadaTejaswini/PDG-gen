import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> ans = new ArrayList<String>();
    String[] ab;
    while(true) {
      String line = sc.nextLine();
      if(line.length() == 0 || line.contains("0 0")) {
        break;
      }
      ab = line.split(" ");
      int a = Integer.parseInt(ab[0]);
      int b = Integer.parseInt(ab[1]);
      if(a < b) {
        ans.add(a + " " + b);
      }else {
        ans.add(b + " " + a);
      }
    }
    for(int i = 0; i < ans.size(); i++) {
      System.out.println(ans.get(i));
    }

  }
}

