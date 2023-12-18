import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        for(int i = 0;i <= n - 1;i++){
            if((i + 1) % 3 == 0){
                System.out.print(i + 1 + " ");
            }
        }
    }
}
