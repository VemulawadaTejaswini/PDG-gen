import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int n,x;
        while(true){
            n = scan.nextInt();
            x = scan.nextInt();
            if(n == 0 && x == 0){
                break;
            }
            result(n,x);
        }
    }
    
    public static void result(int n,int x){
        int sum = 0;
        for(int i = 1;i != n - 1;i++){
            for(int j = i + 1;j != n;j++){
                for(int I = j + 1;I != n + 1;I++){
                    if(i + j + I == x){
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
