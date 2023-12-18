import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int work = 0;
        work = x ;
        x = y;
        y = work;
        work = x ;
        x = z;
        z = work;
        System.out.println(x + " " + y + " " + z);
        sc.close();


    }
}