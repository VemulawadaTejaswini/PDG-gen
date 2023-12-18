import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int mod = a % 1000;
    
    int result;
    if (mod == 0) {
      result = 0;
    } else {
      result = 1000 - mod;
    }
    
    System.out.println(result);
  }
}