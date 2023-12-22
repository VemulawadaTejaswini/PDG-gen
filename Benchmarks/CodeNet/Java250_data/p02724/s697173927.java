
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int x = 500;
        int y = 5;
        long happy = (a/x)*1000+(a%x/y)*y;
        System.out.println(happy);
    }
}