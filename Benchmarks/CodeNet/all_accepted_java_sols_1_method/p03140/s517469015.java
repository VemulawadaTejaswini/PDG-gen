import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    String A = sc.nextLine();
    String B = sc.nextLine();
    String C = sc.nextLine();
    char[] cha = A.toCharArray();
    char[] chb = B.toCharArray();
    char[] chc = C.toCharArray();
    int sum = 0;
    for (int i = 0; i < N; i++) {
      int[] mat = new int[26];
      mat[cha[i] - 'a']++;
      mat[chb[i] - 'a']++;
      mat[chc[i] - 'a']++;

      int max = 0;
      for (int j = 0; j < mat.length; j++) {
        max = Math.max(max, mat[j]);
      }
      sum += (3 - max);
    }
    System.out.println(sum);
  }
}
