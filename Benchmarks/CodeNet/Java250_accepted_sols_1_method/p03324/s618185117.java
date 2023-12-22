import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = "";
    for(int i = 0; i < n; i++){
      str += "00";
    }

    int m = sc.nextInt();
    if (m == 100) m++;
    System.out.println(m + str);
  }
}
