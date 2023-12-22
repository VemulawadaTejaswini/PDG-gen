import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] p = new int[sc.nextInt()];

    for(int pIdx=0;pIdx<p.length;pIdx++){
      p[pIdx]=sc.nextInt();
    }

    int count=0;
    for(int pIdx = 1;pIdx<p.length-1;pIdx++){
      if(isMatch(p[pIdx-1],p[pIdx],p[pIdx+1]))count++;
    }
    System.out.println(count);
  }

  static boolean isMatch(int pm1, int p0, int pp1) {
    if(p0 < pm1 && p0 < pp1) return false;
    return !(p0 > pm1 && p0 > pp1);
  }
}
