import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area = a * b;
        int length = 2 * (a + b);
        System.out.println(area +" "+length);
    }
}
