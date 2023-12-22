import java.util.*;

public class Main{
  public static void main(String args[] ) {
     Scanner sc = new Scanner(System.in);
     int x,t=0;
     
     while(true){
     x = sc.nextInt();
     if ( x == 0 ) break;
     t++;
     System.out.println("Case "+ t +": "+ x);
     }
  }
}

