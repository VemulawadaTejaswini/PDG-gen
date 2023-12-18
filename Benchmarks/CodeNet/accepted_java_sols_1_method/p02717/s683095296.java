import java.util.Scanner;

public class Main{

 public static void main(String[] args){
  
   Scanner sc = new Scanner(System.in);
   
   int[] array = new int[3];
   
   for (int i = 0; i<array.length; i++){
    
     array[i] = sc.nextInt();
     
   }
   
   System.out.println(array[2] + " " + array[0] + " " + array[1]);
   
 }
  
  
  
  
}  