import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = 0;
    while(((x*a)-(x-1))<b){
      if(((x*a)-(x-1))<b){
        x++;
      }else{
        break;
      } 
    }
    System.out.println(x);
  }
}