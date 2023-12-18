        import java.util.*;
        public class Main{
          public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = 0;
            
            if(a-b == 0){
              System.out.println(1);
            }else{
            x = a-b;
            System.out.println(x+1);
            }
         }
        }