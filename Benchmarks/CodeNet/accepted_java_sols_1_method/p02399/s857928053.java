import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        double c = (double)a/b;
        String d = String.format("%.5f", c);
        System.out.println(a/b+" "+a%b+" "+d);
    }
}

