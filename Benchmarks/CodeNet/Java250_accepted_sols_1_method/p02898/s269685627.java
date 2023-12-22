import java.util.*;

public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int border = sc.nextInt();
    int can = 0;
    
    for (int i = 0; i < num; i++){
      if(sc.nextInt()>=border){
        can++;
      }
    }
    
    System.out.println(can);
  }
}