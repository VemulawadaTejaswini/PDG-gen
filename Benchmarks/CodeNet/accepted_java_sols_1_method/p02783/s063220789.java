import java.util.Scanner;
import static java.lang.Math.ceil;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int A=sc.nextInt();
        System.out.print((int)ceil(((double)H)/A));
    }
}