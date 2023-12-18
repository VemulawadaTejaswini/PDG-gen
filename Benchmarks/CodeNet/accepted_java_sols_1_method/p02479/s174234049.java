import java.util.Scanner;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        Scanner r = new Scanner(System.in);
        double rd = r.nextDouble();
        System.out.printf("%6f %6f", Math.PI*rd*rd, Math.PI*rd*2);
    }
}