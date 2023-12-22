import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        String a=sc.next();
        String b=sc.next();
        int x=sc.nextInt();
        int y=sc.nextInt();
        String p=sc.next();
        if(p.equals(a))
            x--;
        if(p.equals(b))
            y--;
        System.out.println(x+" "+y);


    }
}
