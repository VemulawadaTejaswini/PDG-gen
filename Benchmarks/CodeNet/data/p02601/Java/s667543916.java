import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();
        int count =0;
        int limit = sc.nextInt();
        for(int i=0; i<=limit; i++){
            if(red<green && green<blue){
                break;
            }else if(red>green){
                green=green*2;
                count++;
            }else if(green>blue){
                blue=blue*2;
                count++;
            }
       }
       if(red<green &&green<blue){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
    }
}