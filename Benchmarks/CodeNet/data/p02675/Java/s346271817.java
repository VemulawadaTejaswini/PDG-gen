import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      int N;
      String an = scan.nextLine();
      N = Integer.parseInt(an);
       //System.out.println(N);
      check(N);
        scan.close();
    }
  
  public static void check(int n){
    int c;
    c = n % 10;
    if(c == 3){
       System.out.println("bon");
      return;
    }else if((c == 0)||(c ==1)||(c ==6)||(c ==8)){
      System.out.println("pon");
      return;
    }else{
      System.out.println("hon");
      return;
    }
    
  }
}