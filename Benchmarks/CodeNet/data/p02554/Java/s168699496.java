    import java.util.*;
    class Main{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 1;
        int b = 1;
        int c = 1;
        
        
        for(int i = 1; i <= N ; i++){
          a *= 10;
          b *= 8;
          c *= 9;
            
        }     
        
        System.out.println((a + b - 2*c)%1000000007);
      }
    }