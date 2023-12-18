import java.util.*;

public class Main {
  public static void main(String[] args) {    
	Scanner sc = new Scanner(System.in);
    String[] str = sc.nextLine().split("");
    int count = 0;
    for(String e : str) {
      if(e.equals("1")) {
        count++;
      }
    }
    System.out.println(count);
  }
}