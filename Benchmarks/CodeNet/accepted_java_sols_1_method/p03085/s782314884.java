import java.util.*;
public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char c = s.charAt(0);
    char ans;
    switch (c) {
      case 'A':
        ans = 'T';
        break;
      case 'C':
        ans = 'G';
        break;
      case 'G':
        ans = 'C';
        break;
      case 'T':
        ans = 'A';
        break;
      default:
        throw new IllegalArgumentException("invalid input");
    }
    
    System.out.println(ans);
  }  
}