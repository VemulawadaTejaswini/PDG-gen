

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
      int n;
      int sum =0;
      n=input.nextInt();
      
      for(int i =1;i<=n;i++){
          sum+=i;
      }
      System.out.print(sum);
      
        
        
    }
    
}
