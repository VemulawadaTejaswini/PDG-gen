import java.io.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = 0;
        int min = 0;
        int i = 0;
        int x = 0;
        int sum = 0;
        while(i <= n - 1){
            /*maxとminの処理*/
            if(i == 0){
                x = scan.nextInt();
                max = x;
                min = x;
            }else{
                x = scan.nextInt();
                if(x > max){
                    max = x;
                }else if(x < min){
                    min = x;
                }
            }
            /*sumの処理*/
            sum += x;
            /*出力*/
            
            i++;
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
    }
}
