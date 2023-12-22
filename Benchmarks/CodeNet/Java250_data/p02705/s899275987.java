import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String args[]){
        int radius;
        double circumference;
        Scanner sc = new Scanner(System.in);

        radius = sc.nextInt();
        circumference = Math.PI*2*radius;
        System.out.println(circumference);
    }
}