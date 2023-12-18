import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    byte[][][] dorm = new byte[4][3][10];
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int B, F, R;
    byte V;
    
    while (N != 0) {
      B = in.nextInt() - 1;
      F = in.nextInt() - 1;
      R = in.nextInt() - 1;
      V = in.nextByte();
      dorm[B][F][R] += V;
      N--;
    }
    StringBuilder output = new StringBuilder();
    String crlf = System.getProperty("line.separator");
    
    for (int b = 0; b < 4; b++) {
      for (int f = 0; f < 3; f++) {
        for (int r = 0; r < 10; r++) {
          output.append(" ").append(dorm[b][f][r]);
        }
        if (b != 3 || f != 2) output.append(crlf);
      }
      if (b != 3) output.append("####################").append(crlf);
    }
    
    System.out.println(output.toString());
  }
}