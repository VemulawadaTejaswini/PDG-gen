//package beg_173;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = a%100;
        System.out.println(Math.max(b,-1*(1000-b)));

    }
}
