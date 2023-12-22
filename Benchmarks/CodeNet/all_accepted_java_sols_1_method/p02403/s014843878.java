import java.io.*;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
        do{
            String line1 = scanner.next();
            String line2 = scanner.next();
            int h = Integer.parseInt(line1);
            int w = Integer.parseInt(line2);
            if(h == 0 && w == 0){
                break;
            }
            for(int i =0;i < h; i++){
                for(int j = 0; j < w; j++){
                    System.out.print("#");
                }
                System.out.print("\n");
            }

            System.out.print("\n");
 
        }while(true);
       
    }

}


