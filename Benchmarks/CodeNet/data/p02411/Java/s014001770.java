import java.io.*;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
 
        do{
            String line1 = scanner.next();
            String line2 = scanner.next();
            String line3 = scanner.next();

            int a = Integer.parseInt(line1);
            int b = Integer.parseInt(line2);
            int c = Integer.parseInt(line3);

            int sum = (a + b);

            if(a == -1 && b == -1 && c == -1){
                break;
            }

            if(a == -1 || b == -1)System.out.println("F");
            else if(sum >= 80)System.out.println("A");
            else if(sum >= 65)System.out.println("B");
            else if(sum >= 50 || c >= 50)System.out.println("C");
            else if(sum >= 30)System.out.println("D");
            else System.out.println("F");

        }while(true);
       
    }
}


