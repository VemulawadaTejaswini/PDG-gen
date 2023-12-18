package java2018;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x==0&&y==0){
            break;
        }if(x<y){
            System.out.println(x+" "+y);
        }if(y<x){
            System.out.println(y+" "+x);
        }if(x==y){
            System.out.println(x+" "+y);
        }
        }
    }
}
