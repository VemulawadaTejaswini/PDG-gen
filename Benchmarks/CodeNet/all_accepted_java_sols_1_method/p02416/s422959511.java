import java.util.*;

public class Main {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     while(true){
String a= sc.next();
    
     if(a.equals("0")) 
         break;
     
     
     int sum= 0;
     
     
     for(int i= 0;i<a.length();i++)
{ 
    sum+= Character.getNumericValue(a.charAt(i));
              
     } 
     
     System.out.println(sum); 
    

   
}}}


