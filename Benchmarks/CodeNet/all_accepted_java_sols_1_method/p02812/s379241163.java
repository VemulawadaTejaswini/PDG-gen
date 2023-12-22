import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int N = scan.nextInt();
       int count = 0;
       String m = "A";
       String str = scan.next();
       for(int i = 0;i<N-2;i++){
           if(str.substring(i,i+3).equals("ABC")){
               ++count;
           }
       }
       System.out.println(count);
    }
    
}