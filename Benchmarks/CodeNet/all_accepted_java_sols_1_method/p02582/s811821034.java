public class Main {
  public static void main(String[] args) {
    String S = new java.util.Scanner(System.in).nextLine();
    switch (S) {
      case "SSS":
        System.out.println("0");
        break;
      case "SSR":
      case "SRS":
      case "RSS":
      case "RSR":
        System.out.println("1");
        break;
      case "SRR":
      case "RRS":
        System.out.println("2");
        break;
      case "RRR":
        System.out.println("3");
    }
  }
}
