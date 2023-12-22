import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int RectangleArea = a*b;
        int RectangleLength = (a+b)*2;
        System.out.println(RectangleArea + " " + RectangleLength);
    }
    
}
