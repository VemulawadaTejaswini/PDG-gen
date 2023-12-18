import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int W = Integer.parseInt(scan.next());
        int H = Integer.parseInt(scan.next());
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        int r = Integer.parseInt(scan.next());
        if((r<=x)&&(x<=(W-r))&&((r<=y)&&(y<=(H-r))))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}