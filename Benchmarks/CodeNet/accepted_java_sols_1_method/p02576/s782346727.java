import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    double N=s.nextInt();
    double X=s.nextInt();
    int T=s.nextInt();
    System.out.println((int)(Math.ceil(N/X)*T));
    
  }  
}