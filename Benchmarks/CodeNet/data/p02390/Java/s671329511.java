import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner scan = new java.util.Scanner(System.in);
    int S = scan.nextInt();
    int h, m, s;
    int subH; 
    h = S / 3600;
    subH = S - (3600 * h);
    m = subH / 60;
    s = subH - (60 * m);
    System.out.println(h + ":" + m + ":" + s);
    }
}