import java.util.Scanner;

//import jdk.internal.org.jline.utils.InputStreamReader;

//import java.io.*;

public class Main{
        public static void main(final String[] args){
            Scanner scanner = new Scanner(System.in);
        
            while(true){
                int H = scanner.nextInt();
                int W = scanner.nextInt();
                if(H + W == 0){
                    break;
                }
                
                for(int i = 0; i < H; i++){
                    for(int j = 0; j < W; j++){
                        double flag = Math.pow(-1, i + j);
                        if(flag == 1){
                            System.out.printf("#");
                        }else {
                            System.out.printf(".");
                        }
                        
                    }
                    System.out.printf("\n");
                }
                System.out.printf("\n");
            }
            scanner.close();
        }
         

}
