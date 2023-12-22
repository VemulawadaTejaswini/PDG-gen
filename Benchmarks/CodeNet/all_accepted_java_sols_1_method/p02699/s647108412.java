

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        if(a>b){
            System.out.println("safe");
        }else{
            System.out.println("unsafe");
        }
    }
}
