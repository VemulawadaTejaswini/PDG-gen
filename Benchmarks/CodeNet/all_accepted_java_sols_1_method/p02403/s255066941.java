import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        while(x>0&&y>0){
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    System.out.print('#');
                }
                System.out.println();
            }
            x=scan.nextInt();
            y=scan.nextInt();
            System.out.println();
        }
    }
}
