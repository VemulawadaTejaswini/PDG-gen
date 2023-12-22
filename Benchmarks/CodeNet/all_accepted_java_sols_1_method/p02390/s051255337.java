import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int h = a/3600;
        int m = (a%3600)/60;
        int s = (a%3600)%60;
        System.out.println(h+":"+m+":"+s);
    }
}