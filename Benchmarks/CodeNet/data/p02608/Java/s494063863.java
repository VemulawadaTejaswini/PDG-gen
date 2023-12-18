import java.util.*;



public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    for(int i = 1; i <= n; i++){
      int ans = 0;
      for(int x = 1; x < i; x++){
        for(int y = 1; y <= x; y++){
          for(int z = 1; z <= y; z++){
            if(x*x + y*y + z*z + x*y + y*z + z*x == i){
              if(x == y && y == z){
                ans++;
              }else if(x==y || y == z){
                ans += 3;
              }else{
                ans += 6;
              }
            }
          }
        }
      }


      System.out.println(ans);
    }

   
    
    scanner.close();
    return;
  }
  
}
