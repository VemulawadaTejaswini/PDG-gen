import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int S=sc.nextInt();
    int W=sc.nextInt();
  if (W-S>=0) {
    System.out.println("unsafe");
  }else{
    System.out.println("safe");  
  }


  }
}
