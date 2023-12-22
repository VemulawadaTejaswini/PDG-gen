import java.util.Scanner;
import java.util.HashSet;
import java.lang.String;
 
public class Main {
  
  public static void main (String[] arg) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> pcolors = new HashSet<Integer>();
    pcolors.add(sc.nextInt());
    pcolors.add(sc.nextInt());
    pcolors.add(sc.nextInt());    
    sc.close();
    
    System.out.println(pcolors.size());
  }
}