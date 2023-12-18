import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] c = sc.next().toCharArray();
    Arrays.sort(c);
    System.out.println(c[0]-c[2] != 0 && c[0]-c[1]+c[2]-c[3] == 0 ? "Yes" : "No");

  }
}