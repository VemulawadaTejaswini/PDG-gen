import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    HashMap<String,String> map = new HashMap<String,String>();

    for(int i = 0; i < n; i++) {
      String str = sc.next();
      map.put(str,str);
    }
    System.out.println(map.size());

    sc.close();
  }
}