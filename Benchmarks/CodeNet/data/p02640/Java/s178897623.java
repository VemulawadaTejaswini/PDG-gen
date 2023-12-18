    import java.util.*;
     
    class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int l=0;
       
        if(y==2*x) 
           System.out.println("Yes");
        for (int i = 0; i < x; i++) {
         l=2*i+4*(x-i);
        
          if(l==y)
            System.out.println("Yes"); 
          break;
           else
             System.out.println("No");

          
        }
         
        
      }
    }