import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = {a,b,c};
        Arrays.sort(arr);

        if ((arr[0]==arr[1] && arr[0]!=arr[2]) || (arr[1]==arr[2] && arr[0]!=arr[1]))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
