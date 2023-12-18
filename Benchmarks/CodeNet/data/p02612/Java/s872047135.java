

import java.lang.reflect.Array;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        if (x%1000==0){
            System.out.println("0");
        }
        else if (x%1000!=0){
            System.out.println(1000-(x%1000));
        }
    }
}
