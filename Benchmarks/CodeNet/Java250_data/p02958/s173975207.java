import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();  
    int[] a;
    a = new int[N];
    int b = 0;
    
    for (int i = 0; i < N; i++){     
      a[i]=sc.nextInt();
      
      if (a[i]==i+1){
      }else{
          b += 1;
      }
    }
    
    if (b>2){
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
}