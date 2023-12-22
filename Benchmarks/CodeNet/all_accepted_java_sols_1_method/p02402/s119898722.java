import java.util.*;

class Main{
  static long number,a,b,max,min,total,ave; 
  static int i = 0;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    number = sc.nextInt();
    a = sc.nextLong();
    max = a;
    min = a;
    total = a;
    while(i< number-1) {
      b = sc.nextLong();
      if (b > max) {
        max = b;
      }
      if (b < min) {
        min = b;
      }
      total += b;
      i++;
    }
    System.out.println(min + " " + max + " " + total);
  }
}

