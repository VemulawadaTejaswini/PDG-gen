import java.util.*;
public class Main{

  
  public static void main(String[] args){
  
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int ss=s.nextInt();
    if(k%n==0 || ss%n==0){System.out.println("OK" );}
    else if(  (int)(k/n) == (int)(ss/n)  ){
    System.out.println("NG");}
    else{System.out.println("OK");}
  
  }
  
}