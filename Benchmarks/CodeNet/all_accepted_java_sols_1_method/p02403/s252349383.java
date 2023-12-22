import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H, W;
        int[] tate = new int [100];
        int[] yoko = new int [100];
        int i=0;
        int j=0;
        int k=0;
        int l=0;
        //scan.close();
        try{
            
            while((H = scan.nextInt()) != 0 && (W = scan.nextInt()) != 0){
               
                tate[i] = H;
                yoko[i] = W;
                i++;
            }
            
            while(l<i){
                for(j=0; j<tate[l]; j++){
                    for(k=0; k<yoko[l]; k++){
                        
                        System.out.printf("#");
                    }
                    System.out.printf("\n");
                }
                
                l++;
                
                System.out.printf("\n");
        
            }
            scan.close();
        }
        
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
