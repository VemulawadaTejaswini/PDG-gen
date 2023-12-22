    import java.io.InputStream;
    import java.io.PrintStream;
    import java.util.Scanner;
     
    public class Main {
     
      public static void main(String[] args) {
        resolve(System.in, System.out);
      }
     
      static void resolve(InputStream is, PrintStream pw) {
        Scanner sc = new Scanner(is);
        int n = Integer.parseInt(sc.next());
        int nextExpectation = 1;
        int brokenBlock = 0;
        for (int i = 0; i < n; i++) {
          int ai = Integer.parseInt(sc.next());
          if (ai == nextExpectation) {
            nextExpectation++;
          } else {
            brokenBlock++;
          }
        }
        if (nextExpectation == 1) {
          pw.println(-1);
        } else {
          pw.println(brokenBlock);
        }
      }
    }