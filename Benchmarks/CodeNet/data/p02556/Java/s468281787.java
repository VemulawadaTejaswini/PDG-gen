import java.util.*;
import java.io.*;
 
public class Main{
  Scanner sc = new Scanner(System.in);	
 
  public void run(){
    int n = sc.nextInt();
    
    int MAX = 1234567;
    int posMax = -MAX;
    int posMin = MAX;
    int negMax = -MAX;
    int negMin = MAX;
    
    for(int i = 0 ;i < n ; i++){
      int x = sc.nextInt();
      int y = sc.nextInt();
      
      int pos = x+y;
      int neg = x-y;
      posMax = Math.max(posMax, pos);
      posMin = Math.min(posMin, pos);
      negMax = Math.max(negMax, neg);
      negMin = Math.min(negMin, neg);
    }
    
    System.out.println(Math.max(posMax-posMin, negMax-negMin));
  }
  public static void main(String[] args){
    Main m = new Main();
    m.run();
  }
}