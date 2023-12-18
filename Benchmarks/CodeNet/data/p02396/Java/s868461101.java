import java.util.*;
     
public class Main
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
     
        for(int i = 1; i<=10000; i++){
         int x = scanner.nextInt();
         if(0 < x){
          System.out.println("Case" + i +": "+ x);
         }else{
         }
        }
   }
}