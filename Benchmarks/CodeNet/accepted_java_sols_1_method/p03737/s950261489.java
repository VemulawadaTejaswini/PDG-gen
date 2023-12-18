import java.util.Scanner;
     
    public class Main {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();

        System.out.println(A.substring(0, 1).toUpperCase() + B.substring(0, 1).toUpperCase() + C.substring(0, 1).toUpperCase());
      }
    }
