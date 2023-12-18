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
                /*int H = scan.nextInt();
                int W = scan.nextInt();
                if(H == 0 && W == 0){
                    break;
                }*/

                tate[i] = H;
                yoko[i] = W;
                i++;
            }
           // System.out.printf("\n");
            while(l<i){
                for(j=0; j<tate[l]; j++){
                    for(k=0; k<yoko[l]; k++){
                        if(j%2 == 1){
                            if(k%2 == 1){
                                System.out.printf("#");
                            }else{
                                System.out.printf(".");
                            }
                        }else{
                            if(k%2 == 1){
                                System.out.printf(".");
                            }else{
                                System.out.printf("#");
                            }
                        }
                    }
                    System.out.printf("\n");
                }
                System.out.printf("\n");
                l++;
            }
            scan.close();
        }
        
        catch(NumberFormatException e){
            System.out.println(e);
        }/*catch(IOException e){
            System.out.println(e);
        }*/
    }
}
