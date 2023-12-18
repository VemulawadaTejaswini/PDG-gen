import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        String a=sc.next();
        char m[]=a.toCharArray();
        if(m[0]>='a'&&m[0]<='z')
            System.out.println("a");
        else System.out.println("A");
    }
}
