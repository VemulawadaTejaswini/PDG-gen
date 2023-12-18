import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
      int K = in.nextLine();  
      String S = in.next();
      
      if (S.length()<=K){
          System.out.println(S);
         }
         else {
           System.out.println(S.substring(0,K)+ "...");
                }
        }
    }