import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double area=r*r*Math.PI;
        double len=2*r*Math.PI;
        System.out.printf("%f %f\n",area,len);
    }
}