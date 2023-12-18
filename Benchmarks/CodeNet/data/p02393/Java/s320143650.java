import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter("\\s");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a > b ){
     int t = a;   
         a = b;
         b = t; 
         if(b > c){
     int y = b;
         b = c;
         c = y;

            if(a > b){
               int u = b;
               b = a;
               a = u;


            }
       }
    }
    
    if(a == c){
               int i = b;
               b = c;
               c = i;
     }

	System.out.println(a + " " + b + " " + c);

    

       
   
  }

}