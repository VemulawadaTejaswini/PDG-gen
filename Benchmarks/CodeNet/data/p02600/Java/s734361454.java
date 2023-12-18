import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int ans = 0;
    
    if(400<=x && x <= 599){
      ans = 8;
    }else if(600<=x && x <= 799){
      ans = 7;
    }else if(800<=x && x <= 999){
      ans = 6;
    }else if(1000<=x && x <= 1199){
      ans = 5;
    }else if(1200<=x && x <= 1399){
      ans = 4;
    }else if(1400<=x && x <= 1599){
      ans = 3;
    }else if(1600<=x && x <= 1799){
      ans = 2;
    }else if(1800<=x && x <= 1999){
      ans = 1;
    }
    
    System.out.println(ans);
    
  }
}