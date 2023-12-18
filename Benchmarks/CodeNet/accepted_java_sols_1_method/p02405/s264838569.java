import java.io.*;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        do{
            String line1 = scanner.next();
            String line2 = scanner.next();

            int h = Integer.parseInt(line1);
            int w = Integer.parseInt(line2);

            if(h == 0 && w == 0){
                break;
            }         

            for(int i = 1;i <= h; i++){
                for(int j = 1;j<=w;j++){
                    if(i%2 == 1 && j%2 == 1){
                        System.out.print("#");
                    }else if(i%2 == 1 && j%2 == 0){
                        System.out.print(".");
                    }
                    if(i%2 == 0 && j%2 ==1){
                        System.out.print(".");
                    }else if(i%2 == 0 && j%2 == 0){
                        System.out.print("#");
                    }
                }
                System.out.print("\n");
            }   
            System.out.print("\n");
        }while(true);
    }
}


