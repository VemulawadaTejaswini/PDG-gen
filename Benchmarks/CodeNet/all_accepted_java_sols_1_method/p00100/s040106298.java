import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      List<Integer> nos = new ArrayList<Integer>();
      List<Double> prs = new ArrayList<Double>();
      for (int ii = 0; ii < n; ii++) {
        Integer no = scanner.nextInt();
        Double at = scanner.nextDouble();
        Double cn = scanner.nextDouble();
        int pos = nos.indexOf(no);
        if (pos != -1) {
          prs.set(pos, prs.get(pos) + at * cn);
        } else {
          nos.add(no);
          prs.add(at * cn);
        }
      }

boolean flag = true;
for (int ii = 0; ii < nos.size(); ii++) {
  if (prs.get(ii) >= 1000000) {
    System.out.println(nos.get(ii));
    flag = false;
  }
}
if (flag) {
  System.out.println("NA");
}
    }
  }
}