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
    
    int alice = 0;
    int bob = 0;
    
    if(n%2==0){
      for(int i=0 ; i<n ; i++){
        if(i%2==0){
          bob += param[i];
        }else{
          alice += param[i];
        }
      }
    }else{
      for(int i=0 ; i<n ; i++){
        if(i%2==0){
          alice += param[i];
        }else{
          bob += param[i];
        }
      }
    }
    
    int total = alice - bob;
    System.out.println(total);
  }
}