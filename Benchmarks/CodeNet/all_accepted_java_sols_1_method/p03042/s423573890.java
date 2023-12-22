import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int s = stdIn.nextInt();
    int simo = s%100;
    int ue = s/100;
    if((ue>=13&&simo<=12&&simo>=1)||(ue==0&&simo<=12&&simo>=1)) {
      System.out.println("YYMM");
    } else if((simo>=13&&ue<=12&&ue>=1)||(simo==0&&ue<=12&&ue>=1)) {
      System.out.println("MMYY");
    } else if(ue<=12&&simo<=12&&ue>=1&&simo>=1) {
      System.out.println("AMBIGUOUS");
    } else {
      System.out.println("NA");
    }
  }
}
