import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        if (r%2 == 0)
            System.out.println(r/2);
        else
            System.out.println((r/2)+1);
    }
}
