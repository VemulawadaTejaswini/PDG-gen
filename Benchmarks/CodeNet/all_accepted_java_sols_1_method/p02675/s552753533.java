import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int N_1 = N%10;
    
    if( N_1 == 3)
      System.out.println("bon");
    else{
      if(N_1 == 0 || N_1 == 1 || N_1 == 6 || N_1 == 8 )
        System.out.println("pon");
      else
        System.out.println("hon");
    }
  }
}