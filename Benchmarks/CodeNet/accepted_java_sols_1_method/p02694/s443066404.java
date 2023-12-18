import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn= new Scanner(System.in);
        long x = stdIn.nextLong();
        long a=100;
        int y=0;
        for(;a<x;y++){
            a+=a/100;
        }
        System.out.println(y);
    }
}
