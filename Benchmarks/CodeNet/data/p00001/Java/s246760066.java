import  java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=0;i<10;i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        for(int i=9;i>6;i--){
            System.out.println(a[i]);
        }
    }
}