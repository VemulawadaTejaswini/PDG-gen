import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner scan = new java.util.Scanner(System.in);
    int S = scan.nextInt();
    int h, m1, m, s;
    h = S / 3600;
    m1 = S % 3600;
    m = m1 / 60;
    s = m % 60;
    System.out.println(h + ":" + m + ":" + s);
    }
}