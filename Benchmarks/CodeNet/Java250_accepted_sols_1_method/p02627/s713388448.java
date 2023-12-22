import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
      String str1 = new String(S);
          if(Character.isUpperCase(str1.charAt( 0 ))){
            String T = str1.toLowerCase();
            System.out.println("A");
          }
         else {String T = str1.toUpperCase();
           System.out.println("a");
                }
        }
    }