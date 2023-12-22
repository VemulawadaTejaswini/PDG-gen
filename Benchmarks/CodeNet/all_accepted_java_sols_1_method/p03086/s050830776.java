import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0;
    int max = 0;
    for(int i = 0; i < s.length(); i++){
      char n = s.charAt(i);
      switch(n){
        case 'A':
        case 'G':
        case 'T':
        case 'C':
          count++;
          break;
        default:
          count = 0;
      }
      max = Math.max(max, count);
    }
    System.out.println(max);
  }
}