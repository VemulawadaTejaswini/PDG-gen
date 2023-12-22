import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String S = sc.next();
      char[]chars = S.toCharArray();
      int[]ints = new int[chars.length];

      for (int i=0; i < chars.length; i++) {
        ints[i] = chars[i];
        ints[i] += N;
        if (ints[i] > 90) {
          ints[i] -= 26;
        }
        chars[i] = (char)ints[i];
        System.out.print(chars[i]);
      }
    }      
}