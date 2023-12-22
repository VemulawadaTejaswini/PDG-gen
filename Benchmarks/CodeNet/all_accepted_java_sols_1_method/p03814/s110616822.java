import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int firstA = line.indexOf("A");
    int lastZ = line.lastIndexOf("Z");
    line = line.substring(firstA, lastZ + 1);
    System.out.println(line.length());
    
  }
}