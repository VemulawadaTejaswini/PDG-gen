import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    char[] c = null;
    
    sc.close();
    
    int count = 0;
    for(int i = a ; i <= b ; i++){
      c = String.valueOf(i).toCharArray();
      if( c[0] == c[4] && c[1] == c[3]){
        count++;
      }
    }
    System.out.println(count);
  }
}
