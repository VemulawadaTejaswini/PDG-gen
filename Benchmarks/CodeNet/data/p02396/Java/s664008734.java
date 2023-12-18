import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x=scan.nextInt();
        int cnt=0;
        while(x!=0){
            System.out.println("Case "+(++cnt)+": "+x);
            x=scan.nextInt();
        }
    }
}
