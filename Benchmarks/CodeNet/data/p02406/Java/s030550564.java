import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        String st = "";
        for(int i = 0;i <= n - 1;i++){
            int j = 10;
            if((i + 1) % 3 == 0){
                st += " " + (i + 1);
            }else if((i + 1) % 10 == 3){
                st += " " + (i + 1);
            }else{
                while(j <= 1000){
                    if((i + 1) / j == 3){
                        st += " " + (i + 1);
                    }
                    j *= 10;
                }
            }
        }
        System.out.println(st);
    }
}
