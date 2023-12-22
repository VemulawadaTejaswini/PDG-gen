import java.util.*;
public class Main {
  public static void main(final String[] args){
    
    final Scanner sc = new Scanner(System.in);
    final int iTemp = sc.nextInt();
    String sSwitch = "No";
      
      if(iTemp >= 30 ){
        sSwitch = "Yes";
      }
    System.out.println(sSwitch);
  }
}