import java.util.*;

public class Main{
  public static void main(String[] args) {
    Set colorSet = new HashSet();
    Scanner sc = new Scanner(System.in);
    int color1 = sc.nextInt();
    int color2 = sc.nextInt();
    int color3 = sc.nextInt();

    colorSet.add(color1);
    colorSet.add(color2);
    colorSet.add(color3);

    System.out.println(colorSet.size());
  }
}
