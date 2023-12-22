import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt();
    sc.close();
    int L = S/100;
    int R = S%100;
    if (L>=1 && L<=12){
      if (R>=1 && R<=12){
        System.out.println("AMBIGUOUS");
      }else{
        System.out.println("MMYY");
      }
    }else{
      if (R>=1 && R<=12){
        System.out.println("YYMM");
      }else{
        System.out.println("NA");
      }
    }
  }
}