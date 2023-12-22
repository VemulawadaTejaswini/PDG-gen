import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();
        String[] num = str.split(" ",0);
        int a, b;
        a = Integer.valueOf(num[0]);
        b = Integer.valueOf(num[1]);
        System.out.println(a/b + " " + a%b + " " + String.format("%.8f", (double)a/b));
        scan.close();
    }
}
