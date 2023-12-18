import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int cnt = 0;
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      if (line.length() == 1) {
        cnt++;
        continue;
      }
      List<String> strc = new ArrayList<String>();
      List<String> strr = new ArrayList<String>();
      for (int ii = 0; ii < line.length(); ii++) {
        strc.add(line.substring(ii, ii + 1));
        strr.add(line.substring(ii, ii + 1));
      }
      Collections.reverse(strr);
      boolean flag = true;
      for (int ii = 0; ii < strc.size(); ii++) {
        if (!strc.get(ii).equals(strr.get(ii))) {
          flag = false;
          break;
        }
      }
      if (flag) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}