import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if (a%1000 == 0)
            System.out.println("0");
        else
            System.out.println(1000-(a%1000));

    }
}
