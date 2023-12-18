import java.util.*;

class Main{
	public static void main(String[] args){
	  Scanner scn = new Scanner(System.in);
      int n = scn.nextInt() % 10;
      if(n == 3){
        System.out.println("bon");
        return;
      }else if(n ==0){
        System.out.println("pon");
        return;
      }else if(n ==1){
        System.out.println("pon");
        return;
      }else if(n ==6){
        System.out.println("pon");
        return;
      }else if(n ==8){
        System.out.println("pon");
        return;
      }else{
        System.out.println("hon");
      }
	}
}
