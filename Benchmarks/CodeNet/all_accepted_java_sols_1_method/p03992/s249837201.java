import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String arr = scan.next();
    String str1 = arr.substring(0,4);
    String str2 = arr.substring(4,12);

    System.out.println(str1+" "+str2);
  }
}
