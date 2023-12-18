import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    double t = Double.parseDouble(sc.next());
    double a = Double.parseDouble(sc.next());
    sc.nextLine();
    int ans = 0;
    String h = sc.nextLine();
    String[] ha = h.split(" ");
    double[] hd = new double[n];
    for (int i = 0; i < n; i++) {
      hd[i] = t - Double.parseDouble(ha[i]) * 0.006;
      if (Math.abs(a - hd[i]) < Math.abs(a - hd[ans]))
        ans = i;  
    }
    System.out.println(ans+1);
  }
}