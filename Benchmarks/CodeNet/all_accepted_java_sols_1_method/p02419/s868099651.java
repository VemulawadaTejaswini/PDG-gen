import java.io.*;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int i = 0;

        do{
            String line = scanner.next();
            if(line.equalsIgnoreCase(word)){
                i++;
            }

            if(line.equals("END_OF_TEXT")){
                System.out.println(i);
                break;
            }
        }while(true);
            
    }
}


