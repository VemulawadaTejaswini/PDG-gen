import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            if(x == 0 && y == 0) break;
            z = x;
            x = y;
            y = z;
            System.out.printf("%d %d\n", x, y);
        }
    }
}
