import java.util.*;

public class Main{
  
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    int x= sc.nextInt();
    
    int canBuy = x/100;
    int change = x%100 ;
    
    for(int i = 0; i < canBuy; i++){
      if(change >= 5){
        change -= 5;
      }else if(change >= 4){
        change -= 4;
      }else if(change >= 3){
        change -= 3;
      }else if(change >= 2){
        change -= 2;
      }else if(change >= 1){
        change -= 1;
      }
    }
    
    if(change == 0){
      System.out.println("1");
    }else{
      System.out.println("0");
    }
    
  }  
}