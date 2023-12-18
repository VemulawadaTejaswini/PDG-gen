import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int d = sc.nextInt();
    
    if(m > d){
      System.out.println(m-1);
    }else{
      System.out.println(m);
    }
  }
}
