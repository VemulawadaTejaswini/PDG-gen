import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
      String k = in.nextLine();  
      String S = in.nextLine();
      int K = Integer.parseInt(k);
     
      if (S.length()<=K){
          System.out.println(S);
         }
         else {
           System.out.println(S.substring(0,K)+ "...");
                }
        }
    }
