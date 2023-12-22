import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       int len = A + B + 1;
       int hit = A;
       String s = sc.nextLine();
       String line = sc.nextLine();
       String []array = line.split("");
       String SS = array[A];
       
       if((array.length == len) && SS.equals("-")){
           for(int i = 0; i < array.length; i++){
               String m = array[i];
               if((!m.matches("^[0-9]+$")) && i != A){
                    System.out.println("No");
                    System.exit(0); 
                }
           }
           System.out.println("Yes");
           System.exit(0);
       }else{
           System.out.println("No");
           System.exit(0);
       }
    }
}
