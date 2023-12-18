import java.io.*;
import java.util.*;

class Main {
  static final double MAX_TIME = 1.0e20;
  static final int MAX_N = 15;
  static final int MAX_BITS = (1 << MAX_N) - 1;

  static class RetBox {
    double time;
    int dist;
    ArrayList<Integer> ids;

    RetBox(double time, int dist, ArrayList<Integer> ids) {
      this.time = time;
      this.dist = dist;
      this.ids = ids;
    }
  }

  static class Storage {
    int id, dist, tresn;

    Storage(int id, int dist, int tresn) {
      this.id = id;
      this.dist = dist;
      this.tresn = tresn;
    }
  }

  static int[][] edges;
  static RetBox[][] pathhash;

  static String intJoin(int[] ns, String delim) {
    String out = "" + ns[0];
    for (int i = 1; i < ns.length; i++)
      out += delim + ns[i];
    return out;
  }

  static String intJoin(ArrayList<Integer> nlist, String delim) {
    String out = "" + nlist.get(0);
    for (int i = 1; i < nlist.size(); i++)
      out += delim + nlist.get(i);
    return out;
  }

  static RetBox check_path(int src, int k, int n, int bits, Storage[] strs) {
    if (pathhash[src][bits] != null) return pathhash[src][bits];

    if (k == 1) {
      ArrayList<Integer> ids = new ArrayList<Integer>();
      ids.add(strs[src].id);
      return (pathhash[src][bits] = new RetBox(0, 0, ids));
    }

    Storage stsrc = strs[src];
    int bits0 = (bits | (1 << src));

    double min_time = MAX_TIME;
    int min_dist = 0;
    ArrayList<Integer> min_ids = null;

    for (int nxt = 0; nxt < n; nxt++) {
      if (((bits0 >> nxt) & 1) != 0) continue;

      RetBox nret = check_path(nxt, k - 1, n, bits0, strs);
      int dist = edges[src][nxt] + nret.dist;
      double time = nret.time + (double)dist * (70 + 20 * stsrc.tresn) / 2000;

      if (min_time > time) {
        min_time = time;
        min_dist = dist;
        min_ids = new ArrayList<Integer>(nret.ids);
        min_ids.add(0, new Integer(stsrc.id));
      }
    }

    return (pathhash[src][bits] = new RetBox(min_time, min_dist, min_ids));
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine().trim());

    Storage[] strs = new Storage[n];

    for (int i = 0; i < n; i++) {
      String[] nums = br.readLine().trim().split(" ");
      strs[i] =
        new Storage(Integer.parseInt(nums[0]),
                    Integer.parseInt(nums[1]),
                    Integer.parseInt(nums[2]));
    }

    edges = new int[n][n];

    for (int i = 0; i < n; i++)
      for (int j = i + 1; j < n; j++)
        edges[i][j] = edges[j][i] =
          Math.abs(strs[i].dist - strs[j].dist);

    pathhash = new RetBox[n][MAX_BITS];

    double min_time = MAX_TIME;
    ArrayList<Integer> min_ids = null;

    for (int src = 0; src < n; src++) {
      RetBox ret = check_path(src, n, n, 0, strs);

      if (min_time > ret.time) {
        min_time = ret.time;
        min_ids = ret.ids;
      }
    }

    System.out.println(intJoin(min_ids, " "));
  }
}