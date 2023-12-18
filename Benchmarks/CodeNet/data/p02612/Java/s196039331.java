import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = Integer.valueOf(sc.nextInt());
    
    while(num >= 0) {
      num = num - 1000;
    } 
    System.out.println((-1) * num);
    sc.close();
  }
}