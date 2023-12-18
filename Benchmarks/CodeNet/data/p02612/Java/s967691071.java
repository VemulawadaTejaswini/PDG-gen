import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = Integer.valueOf(sc.nextInt());
    
    while(num > 0) {
      num = num - 1000;
    } 
    if (num != 0) {
      num = (-1) * num;
    }

    System.out.println(num);
    sc.close();
  }
}