import java.util.*;

public class Main{
  static final int previousPayment = 4280;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int usedWater = sc.nextInt();

      if(usedWater < 0){
        break;
      }

      int payment = 1150;

      for(int i = 11; i <= usedWater; i++){
        if(30 < i) payment += 160;
        else if(20 < i) payment += 140;
        else if(10 < i) payment += 125;
      }

      System.out.println(previousPayment - payment);
    }
  }
}