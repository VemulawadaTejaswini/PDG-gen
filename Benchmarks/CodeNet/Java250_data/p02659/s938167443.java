import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    int b = Integer.parseInt(clean(sc.nextLine()));
    sc.close();
    long r = (a * b) / 100;
    System.out.println(r);
  }
  
  private static String clean(String n) {
    int s = n.length();
    String ns = "";
    for(int i = 0; i < s; i++) {
      char c = n.charAt(i);
      if(c != ' ' && c != '.') ns += c;
    }
    return ns;
  }
}