import java.util.*;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String original = sc.nextLine();
      int n = Integer.parseInt(sc.nextLine());
      
      
      
      for(int i = 0; i < n; i ++){
         String command = sc.next();
         if(command.equals("print")){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            
            print(original,a,b);
         
         }else if(command.equals("replace")){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            String str = sc.next();
            
            original = replace(original, a,b,str);
            
         }else{ //reverse
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            
            original = reverse(original, a,b);
            
         }
      }// end for
         
   }//main
   
   /**
   *print(String, int, int) method
   *@ param str : the original string
   *@ param a        : the beginning index
   *@ param b        : the ending index
   *@ print a string from index a to index b
   */
   
   public static void print(String str, int a, int b){
      System.out.println(str.substring(a,b+1));
   }
   
   /**
   *replace(String,int,int,String) method
   *@ param original : The original string
   *@ param a        : The biginning index to be replaced
   *@ param b        : The ending index to be replaced
   *@ param str      : The string to be replaced into the original
   *@ return a string with string inserted from a to b
   */
   public static String replace(String original, int a, int b, String str){
      String s = "";
      s += original.substring(0,a);
      s += str;
      s += original.substring(b+1);
      
      return s;
   }
   
   /**
   *reverse(String,int,int) method
   *@ param str   : The original string
   *@ param a     : The biginning index to be reversed
   *@ param b     : The last index to be replaced
   *@ return a string 
   */
   
   public static String reverse(String str, int a, int b){
      String s = "";
      s += str.substring(0,a);
      for(int i = b; i >= a; i--){
         s += str.substring(i,i + 1);
      }
      s += str.substring(b + 1);
      
      return s;
      
   }
      
}//class
