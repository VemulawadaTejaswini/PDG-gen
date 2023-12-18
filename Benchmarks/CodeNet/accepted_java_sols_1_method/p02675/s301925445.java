import java.util.*;

public class Main {

  static final String[] ponNum = new String[]{"0", "1", "6", "8"};
  static final String[] bonNum = new String[]{"3"};

  public static void main(String[] args) {
    /**
     * N 2,4,5,7,9
     * N 0,1,6,8
     * N 3
     */        
    Scanner sc = new Scanner(System.in);
    String str;
    str = sc.nextLine();
    String N = str;
    String lastNum = N.substring(N.length() - 1, N.length());
    if (Arrays.asList(ponNum).contains(lastNum)) {
      System.out.println("pon");
    } else if (Arrays.asList(bonNum).contains(lastNum)) {
      System.out.println("bon");
    } else {
      System.out.println("hon");
    }
  }
}