import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int val1 = scan.nextInt();
    int val2 = scan.nextInt();
    int val3 = scan.nextInt();
    int val4 = scan.nextInt();
    
    //System.out.print(val1);
    
    if (val1*val2 > val3*val4){
      System.out.print(val1*val2);
    }else if (val1*val2 < val3*val4){
      System.out.print(val3*val4);
    }else{
      System.out.print(val1 * val2);
    }
    
  }
}