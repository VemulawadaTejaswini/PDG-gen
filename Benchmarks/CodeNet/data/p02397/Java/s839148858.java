import java.io.*;
import java.util.*;

public class case {
    public static void main(String[] args){

        for(int i = 1;i <= 10000;i++){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
            if(x == 0){
                break;
            }
        System.out.println("case " + i + ": " + x);
        }
    }
}