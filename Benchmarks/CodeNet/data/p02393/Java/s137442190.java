import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int t;
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    if(a > b){
    t = a;
    a = b;
    b = t;
    }

    if(b > c){
    t = b;
    b = a;
    c = t;
    }

    if(c > a){
    t = c;
    c = a;
    a = t;
    }


    System.out.println(c + " " + b + " " + a);
    }
}