import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int[] cnts = new int[n];

    for(int i = 0; i < n; i++){
      cnts[i] = 0;
    }
    
    int cal;
    int x, y, z;
    
    for(x = 1; x < 100; x++){
      for(y = 1; true; y++){
        for(z = 1; true; z++){
          cal = x * x + y * y + z * z + x * y + y * z + z * x;
          if(cal > n){break;}
          
          cnts[cal - 1]++;
        }
        
        if(z == 1){break;}
      }
      
      if(y == 1){break;}
    }
    
    for(int i = 0; i < n; i++){
      System.out.println(cnts[i]);
    }
    
  }
}