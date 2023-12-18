import java.util.*;

class Main {
  public static void main(String[] a) {
    Scanner scan = new Scanner(System.in);
    int i = Integer.valueOf(scan.nextLine());
    int h = i / 3600;
    int m = i % 3600 / 60;
    int s = i % 60;
    System.out.printf("%d:%d:%d\n",h,m,s);
    
  }   
}

