import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] alist = new int[N];
    
    for(int i=0; i<N;i++){
      
      alist[i]=sc.nextInt();
    }
    
    Arrays.sort(alist);
    
    int diff = alist[N-1]-alist[0];
    
    System.out.println(diff);
  }
}
