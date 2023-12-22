import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] param = new int[n];
    
    for(int i=0 ; i<n ; i++){
      param[i] = sc.nextInt();
    }
    
    Arrays.sort(param);
    
    int count = 1;
    
    for(int i=1 ; i<n ; i++){
      if(param[i]>param[i-1]){
        count++;
      }
    }
    System.out.println(count);
  }
}