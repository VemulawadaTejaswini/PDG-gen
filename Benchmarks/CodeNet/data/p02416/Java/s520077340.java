import java.util.*;




public class Main {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
    String a= sc.nextLine();
     while(true){
     if(a.equals("0")) {
         break;
     }
     
     int sum= 0;
     
     
     for(char b: a.toCharArray())
{
    
     
         sum+=Integer.parseInt(String.valueOf(b));
         
         
         
     } 
     
     System.out.println(sum);
    
    
    
    
    

   
}}}


