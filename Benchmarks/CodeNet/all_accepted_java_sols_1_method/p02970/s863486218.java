import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int count = 1;
    while(true){
      if(count*(2*d+1) >= n){
        System.out.println(count);
        break;
      } else {
        count++;}
    }
  }
}