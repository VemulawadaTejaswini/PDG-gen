import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int length = sc.nextInt();
      String string1 = sc.next();
      String string2 = sc.next();
      char[] moji1 = new char[length];
      char[] moji2 = new char[length];
      moji1 = string1.toCharArray();
      moji2 = string2.toCharArray();

      String result = "";

      for (int i=0; i < length; i++){
        result = result + moji1[i] + moji2[i];
      }
      System.out.println(result);
    }
}