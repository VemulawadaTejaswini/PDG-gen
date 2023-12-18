import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n < -r)System.out.println(-1);
        else if(n > -r)System.out.println(1);
        else System.out.println(0);
    }



}
