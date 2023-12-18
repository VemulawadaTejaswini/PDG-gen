import java.util.Scanner;

 
public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
     
      String b = sc.next();
      char[]c = b.toCharArray();
     
        
        if(c[0] == 'A'){
          System.out.println('T');
        } else if (c[0] == 'T'){
          System.out.println('A');
        } else if (c[0] == 'C'){
          System.out.println('G');
        } else if(c[0] == 'G') {
          System.out.println('C');
        } 
     
      
      
      
    }
}
          
    
        
       