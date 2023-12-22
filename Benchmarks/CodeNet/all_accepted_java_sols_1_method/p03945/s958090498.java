import java.util.*;
 
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int count = 0;
    char[] x = new char[N.length()];

    for(int i = 0 ; i < N.length() ; i ++){
      x[i] = N.charAt(i);
      if(i != 0){
        count = ((x[i] != x[i - 1]) )  ? count + 1 : count + 0;
      }
      
    }
    System.out.println(count);
  }
}
