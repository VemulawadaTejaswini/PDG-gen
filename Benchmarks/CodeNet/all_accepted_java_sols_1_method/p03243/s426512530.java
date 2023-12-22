import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = 0;
    if(n<=111){
      x = 111;
    }else if(n<=222){
      x = 222;
    }else if(n<=333){
      x = 333;
    }else if(n<=444){
      x = 444;
    }else if(n<=555){
      x = 555;
    }else if(n<=666){
      x = 666;
    }else if(n<=777){
      x = 777;
    }else if(n<=888){
      x = 888;
    }else if(n<=999){
      x = 999;
    }
    System.out.println(x);
  }
 }
