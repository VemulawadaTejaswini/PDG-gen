import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int h = S / 3600;
        int d = (S % 3600) / 60;
        int s = (S % 3600) % 60;
        System.out.println(h+":"+d+":"+s);
        scan.close();
    }
}
