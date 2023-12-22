import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = Integer.parseInt(scan.next());
        Integer a = Integer.parseInt(scan.next());
        Integer b = Integer.parseInt(scan.next());

        if(n * a < b)
            System.out.println(n*a);
        else
            System.out.println(b);
    }
}