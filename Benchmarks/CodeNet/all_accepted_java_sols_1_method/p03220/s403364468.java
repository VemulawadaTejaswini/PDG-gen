import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();
    
    double x = (T - A) *1000 / 6;
    double diff = -1;
    int no = -1;
    
    for(int i=0;i<N;i++)
    {
      int H = sc.nextInt();
      
      if (diff == -1 || diff > Math.abs(H-x) ){
        diff = Math.abs(H-x);
        no = i + 1;
      }
    }
    System.out.println(no);
  }
}