import java.io.*;
import java.util.*;

class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        while(true){
            int h = scan.nextInt();
            int w = scan.nextInt();
            
            if(h < 3) break;
            
            for(int i = 0; i < h; ++i){
                for(int j = 0; j < w; ++j){
                    System.out.print(i == 0 || i + 1 == h || j == 0 || j + 1 == w ? '#' : '.');
                }
                System.out.println();
            }
            
            System.out.println();
        }
    }
}
