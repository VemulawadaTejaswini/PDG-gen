import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int x = scan.nextInt();
    scan.nextLine();
    ArrayList<Integer> l = new ArrayList<Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    Arrays.stream(scan.nextLine().split(" ", -1)).forEach(a -> l.add(Integer.parseInt(a)));
    int ans = 1;
    int pos = 0;
    for(int i = 0; i < n; i++) {
      pos += l.get(i);
      if(pos <= x) {
        ans++;
      } else {
        break;
      }
    }
    System.out.println(ans);
  }
}