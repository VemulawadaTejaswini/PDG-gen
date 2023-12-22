import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int sum = Math.abs(a-b) + Math.abs(b-c) + Math.abs(a-c);
        sum -= Math.max( Math.max( Math.abs(a-b), Math.abs(b-c)), Math.abs(a-c));

        System.out.println(sum);
    }
}