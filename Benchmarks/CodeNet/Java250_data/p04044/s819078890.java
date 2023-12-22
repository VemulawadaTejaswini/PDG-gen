import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    StringBuilder sb = new StringBuilder();
    List<String> sList = new ArrayList<String>();
    for (int i = 0 ; i < n ; i++){
      sList.add(sc.next());
    }
    sList.sort(Comparator.naturalOrder());
    for (String s : sList){
      sb.append(s);
    }
    System.out.println(sb);
    sc.close();
 }
}