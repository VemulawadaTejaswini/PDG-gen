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
    
    int max = param[n-1];
    int min = param[0];
    
    int abs = max-min;
    System.out.println(abs);
  }
}