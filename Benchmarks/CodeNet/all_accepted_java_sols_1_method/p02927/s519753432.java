import java.util.*;
class Main{
  public static void main (String [] args){
    Scanner stdIn = new Scanner(System.in);
    int M = stdIn.nextInt();
    int D = stdIn.nextInt();
    int d1=0; int d10=0;
    int count=0;
    for(int i=1;i<=M;i++){
      for(int j=1;j<=D;j++){
        d1=j%10; d10=j/10;
        if(d1>=2&&d10>=2) if(d1*d10==i) count++;
      }
    }
    System.out.println(count);
    
  }
}