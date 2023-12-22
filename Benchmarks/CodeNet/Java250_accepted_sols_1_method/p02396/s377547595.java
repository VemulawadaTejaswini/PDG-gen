import java.util.Scanner;

public class Main{

      public static void main (String[] args){
             Scanner in = new Scanner(System.in);
             StringBuilder bu = new StringBuilder();
            
             int num = 0;
             int i = 1;
         
             while(true){
                  num = Integer.parseInt(in.next());
                  if(num == 0){
                    break;
                   }

              bu.append ("Case " + i + ": "+ num + "\n");
             i++;
           }
         System.out.print(bu);
   }
}