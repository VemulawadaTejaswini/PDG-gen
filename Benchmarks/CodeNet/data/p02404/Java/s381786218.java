import java.io.*;
import java.util.Scanner;

public class　Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int H,W;
            while(true){
            H = sc.nextInt();
            W = sc.nextInt();
            int k,l;
            for(k=1;k<=W;k++){
                System.out.print("#");
            }
            System.out.print("\n");
            for(l=1;l<=H-2;l++){
                System.out.print("#");
                for(k=1;k<=W-2;k++){
                    System.out.print(".");
                }
                System.out.print("#");
                System.out.print("\n");
            }
            for(k=1;k<=W;k++){
                System.out.print("#");
            }
            System.out.print("\n");
            }
    }
}
