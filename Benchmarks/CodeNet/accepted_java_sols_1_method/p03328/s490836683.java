import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int inputA = sc.nextInt();
     int inputB = sc.nextInt();
     int delta = inputB - inputA;
     int length = 0;
     for (int i = 1; i < delta; i++) {
       length += i;
     }
     int snow = length - inputA;
     System.out.println(snow);
  }
}