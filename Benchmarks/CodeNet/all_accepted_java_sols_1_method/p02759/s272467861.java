import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    //page
    int a = sc.nextInt();
    
    int print = a/2;
    
    
    if(a%2!=0){
      print++;
    }
    
    System.out.println(print);
    
  }
}