 import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true){
            int h=sc.nextInt();
            int w=sc.nextInt();
            if (h==0&&w==0) break;
            for (int i=0;i<h;i++){
                System.out.print("#");
                for (int j=1;j<w-1;j++){
                    if (i==0||i==h-1)
                        System.out.print("#");
                    else
                        System.out.print(".");
                }
                System.out.print("#");
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}