import java.io.*;
import java.util.Scanner;

class Main{
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.println(num/3600 + ":" + (num%3600)/60 + ":" + num%60);
        
    }
}
