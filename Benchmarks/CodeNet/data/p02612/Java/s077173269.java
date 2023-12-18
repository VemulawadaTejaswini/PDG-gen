import java.util.*;
import java.io.*;


public class Atcoder1{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int count = 1;

        while(count * 1000 < value){
            count++;
        }
        System.out.println((count * 1000) - value);
    }
}
