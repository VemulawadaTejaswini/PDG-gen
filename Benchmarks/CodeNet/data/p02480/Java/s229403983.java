import java.util.Scanner;
class Main{
    public static void main(String[] a){
 int a = 0, b = 3, c = 0;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        c = (int) Math.pow(a, b);
        System.out.println(c);
    }
}