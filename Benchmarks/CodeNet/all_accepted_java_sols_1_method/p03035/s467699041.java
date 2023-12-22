import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int t_y = sc.nextInt();
   int num = sc.nextInt();
   
   
   if(t_y<=5){
    System.out.println(0);
   }
   else if(t_y<=12)
    {
    System.out.println(num/2);     
    }
   else
   {
    System.out.println(num);

   }
   
 }
}