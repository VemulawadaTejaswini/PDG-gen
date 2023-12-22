import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    ArrayList<String[]> c = new ArrayList<>();
    for (int i = 0; i < h; i++) {
      c.add(sc.next().split(""));
    }
    int result = 0;
    int hb = (int) Math.pow(2, h);
    int wb = (int) Math.pow(2, w);
    for (int i = 0; i < hb; i++) {
      String hTmp = "000000" + Integer.toString(i, 2);
      String hSt = hTmp.substring(hTmp.length() - h);
      ArrayList<String[]> selectedRows = new ArrayList<>();
      for (int hi = 0; hi < h; hi++) {
        if (hSt.charAt(hi) == '1') {
          selectedRows.add(c.get(hi));
        }
      }
      for (int j = 0; j < wb; j++) {
        String wTmp = "000000" + Integer.toString(j, 2);
        String wSt = wTmp.substring(wTmp.length() - w);
        ArrayList<Integer> selectedIndex = new ArrayList<>();
        for (int wi = 0; wi < w; wi++) {
          if (wSt.charAt(wi) == '1') {
            selectedIndex.add(wi);
          }
        }
        int count = 0;
        for (String[] strings : selectedRows) {
          for (int wi : selectedIndex) {
            if ("#".equals(strings[wi])) {
              count++;
            }
          }
        }
        if (count == k) {
          result++;
        }
      }
    }
    System.out.println(result);
  }
}
