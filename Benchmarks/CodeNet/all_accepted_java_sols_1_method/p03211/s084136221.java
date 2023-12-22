import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    int n = s.length();
    int diff;
    int diffMin = -1;
    int x;
    for(int i = 0; i < n - 2; i++){
      x = 100 * (s.charAt(i) - 48) + 10 * (s.charAt(i + 1) - 48) + (s.charAt(i + 2) - 48);
      diff = x - 753;
      if(diff < 0) diff = -diff;
      if(diffMin == -1 || diff < diffMin) diffMin = diff;
    }
    
    System.out.println(diffMin);
  }
}