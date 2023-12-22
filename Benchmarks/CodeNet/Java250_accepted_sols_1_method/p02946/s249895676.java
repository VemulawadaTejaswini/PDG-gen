import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] black=new int[N*2-1];
   for(int i=0; i<black.length;i++){
     	black[i]=(M-N)+(i+1);
        
   }
    for(int i=0; i<black.length;i++){
      System.out.println(black[i]);
    }
  }
}

