import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int c = (a+b)/2;
    int d = (a+b)%2;
    if(d == 0){
      System.out.println(c);
    }else{
      System.out.println(c+1);
    }

  }
}
