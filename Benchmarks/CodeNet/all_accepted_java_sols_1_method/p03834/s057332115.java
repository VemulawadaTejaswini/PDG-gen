import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] ch = in.next().toCharArray();
    ch[5] = ' ';
    ch[13] = ' ';

    System.out.println(ch);

  }
}