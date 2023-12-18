import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> all = new ArrayList<String>();
    for (int ii = 0; ii < 3; ii++) {
      List <String>gs = new ArrayList<String>();
      for (int jj = 0; jj < 8; jj++) {
        int n = scanner.nextInt();
        double ti = scanner.nextDouble();
        String str = String.format("%03.2f,%02d", ti, n);
        gs.add(str);
        all.add(str);
      }
      Collections.sort(gs);
      for (int jj = 0; jj < 2; jj++) {
        String work[] = gs.get(jj).split(",");
        System.out.printf("%d %.2f\n", Integer.parseInt(work[1]), Double.parseDouble(work[0]));
        all.remove(gs.get(jj));
      }
    }
    Collections.sort(all);
    for (int ii = 0; ii < 2; ii++) {
      String work[] = all.get(ii).split(",");
      System.out.printf("%d %.2f\n", Integer.parseInt(work[1]), Double.parseDouble(work[0]));
    }
  }
}