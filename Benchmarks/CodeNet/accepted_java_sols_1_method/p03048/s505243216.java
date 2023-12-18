import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int G = sc.nextInt();
    int B = sc.nextInt();
    int N = sc.nextInt();
    
    int count = 0;
    
    for (int r=0; r<=N; r++){
      for (int g=0; g<=N; g++){
        int x = N-r*R-g*G;
        if (x>=0 && x % B == 0){
          count++;
        }
      }
    }
    
    System.out.println(count);
  }
}