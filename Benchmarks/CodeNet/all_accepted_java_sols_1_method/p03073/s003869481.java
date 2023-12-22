import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String s[] = str.split("");
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      if (s[i].equals(Integer.toString(i%2)) == false)
        count++;
    }
    System.out.println(str.length()-count<count ? str.length()-count : count);
  }
}
