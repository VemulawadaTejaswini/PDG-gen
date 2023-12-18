import java.util.Scanner;
 public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String s = scanner.next();
      
        int a =s.length();
      
        if(a<=k){
        System.out.println(s);
        }
      else if(a>k){
      System.out.println(s.substring(0,k)+"...");
      }
    }
 }