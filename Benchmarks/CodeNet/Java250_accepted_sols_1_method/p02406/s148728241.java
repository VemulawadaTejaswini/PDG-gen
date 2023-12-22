import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        String st = "";
        for(int i = 0;i <= n - 1;i++){
            //3の倍数
            if((i + 1) % 3 == 0){
                st += " " + (i + 1);
            }
            //1の位が3
            else if((i + 1) % 10 == 3){
                st += " " + (i + 1);
            }
            //10の位が3
            else if((i + 1) % 100 >= 30 && (i + 1) % 100 <= 39){
                st += " " + (i + 1);
            }
            //100の位が3
            else if((i + 1) % 1000 >= 300 && (i + 1) % 1000 <= 399){
                st += " " + (i + 1);
            }
            //1000の位が3
            else if((i + 1) % 10000 >= 3000 && (i + 1) % 10000 <= 3999){
                st += " " + (i + 1);
            }
        }
        System.out.println(st);
    }
}
