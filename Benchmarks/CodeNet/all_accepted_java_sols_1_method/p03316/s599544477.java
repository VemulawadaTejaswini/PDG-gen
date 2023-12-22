import java.util.*;
public class Main{
  
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
   String input = scanner.nextLine();
   int sum = 0;
   for(int x =0; x<input.length(); x++){
     sum = sum + Integer.parseInt(input.substring(x,x+1));
   }
   if(Integer.parseInt(input)%sum==0){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
 }
  
}