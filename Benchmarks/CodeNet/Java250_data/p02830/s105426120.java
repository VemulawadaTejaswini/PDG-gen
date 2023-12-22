import java.util.*; import java.io.*;
public class Main {
 public static void main(String[] args) throws Exception {
  Scanner file = new Scanner(System.in);
  int n = file.nextInt();
  char[] a = file.next().toCharArray();
  char[] b = file.next().toCharArray();
  char[] c = new char[n * 2];
  for (int i = 0; i < n; i++) {
   c[i * 2] = a[i];
   c[i * 2 + 1] = b[i];
  }
  System.out.println(c);
}
}
