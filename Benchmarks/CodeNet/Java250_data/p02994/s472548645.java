import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int taste = 0;
    if(l > 0){
      for(int idx=0; idx<n-1; idx++){
        taste += l + idx + 1;
      }
    }else if(l == 0){
      for(int idx=0; idx<n; idx++){
        taste += l + idx;
      }      
    }else if(l < 0){
      if(n + l > 0){
        for(int idx=0; idx<n; idx++){
          taste += l + idx;
        }              
      }else{
        for(int idx=0; idx<n - 1; idx++){
          taste += l + idx;
        }                      
      }
    }

    System.out.println(taste);
    
  }
}
