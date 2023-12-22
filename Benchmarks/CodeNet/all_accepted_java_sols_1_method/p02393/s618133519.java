import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0;i<3;i++) {
            a[i] =scan.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<3;i++){
            System.out.print(a[i]);
            if(i<2)System.out.print(" ");
        }
        System.out.println("");
    }
}
