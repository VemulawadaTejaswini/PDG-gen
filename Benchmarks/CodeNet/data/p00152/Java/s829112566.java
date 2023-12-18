import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      scanner.nextLine();
      String[] ss = new String[n];
      int[] ss1 = new int[n];
      int[][] ss2 = new int[n][21];
      for (int ii = 0; ii < n; ii++) {
        String line = scanner.nextLine();
        String[] work = line.split(" ");
        ss[ii] = work[0];
        for (int jj = 1, kk = 0; jj < work.length; jj++) {
          int s = Integer.parseInt(work[jj]);
          ss2[ii][kk] = s;
          if (s != 10 || kk >= 18) {
            kk++;
          } else {
            kk += 2;
          }
        }
      }

for (int ii = 0; ii < n; ii++) {
  for (int jj = 0; jj < 17; jj += 2) {
    if (ss2[ii][jj] != 10) {
      int s = ss2[ii][jj] + ss2[ii][jj + 1];
      ss1[ii] += s;
      if (s == 10) {
        ss1[ii] += ss2[ii][jj + 2];
      }
    } else {
      ss1[ii] += 10;
      int kk = jj + 2;
      for (int c = 0; c < 2; c++) {
        ss1[ii] += ss2[ii][kk];
        if (ss2[ii][kk] != 10 || kk >= 18) {
          kk++;
        } else {
          kk += 2;
        }
      }
    }
  }
  ss1[ii] += ss2[ii][18] + ss2[ii][19] + ss2[ii][20];
}

  List<String> sss = new ArrayList<String>();
  for (int ii = 0; ii < ss.length; ii++) {
    sss.add(String.format("%03d,%s", ss1[ii], ss[ii]));
  }
  Collections.sort(sss);
  Collections.reverse(sss);

  List<String> wk = new ArrayList<String>();
  String pre = "";
  for (String el : sss) {
    String[] work = el.split(",");
    if (!pre.equals("") && !work[0].equals(pre)) {
      Collections.sort(wk);
      for (String ell : wk) {
        String[] work2 = ell.split(",");
        System.out.printf("%s %d\n", work2[1], Integer.parseInt(work2[0]));
      }
      wk.clear();
    }
    wk.add(el);
    pre = work[0];
  }
      Collections.sort(wk);
      for (String ell : wk) {
        String[] work = ell.split(",");
        System.out.printf("%s %d\n", work[1], Integer.parseInt(work[0]));
      }


    }
  }
}