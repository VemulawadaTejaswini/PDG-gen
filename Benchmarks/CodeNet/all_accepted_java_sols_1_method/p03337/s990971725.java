import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = {a+b,a-b,a*b};
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
}
