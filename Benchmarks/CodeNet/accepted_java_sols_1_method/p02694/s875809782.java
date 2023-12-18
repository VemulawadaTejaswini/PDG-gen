import java.util.*;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = 100;
    int count = 0;
    while(x > y){
      count = count + 1;
      
      y = y + y / 100;
    }
    
    System.out.println(count);
    sc.close();
  }
}