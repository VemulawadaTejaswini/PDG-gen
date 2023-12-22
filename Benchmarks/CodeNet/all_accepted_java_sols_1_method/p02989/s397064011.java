 import java.util.*; 
 
public class Main{  
  public static void main (String [] args){    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int d[] = new int [N];
    for(int i=0; i<N; i++){
      d[i]=sc.nextInt();
    }
    Arrays.sort(d);
    for(int i=0; i<N; i++){
      System.out.println(d[N/2]-d[N/2-1]);
      break;
    }
  }
}
    
    
