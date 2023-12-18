import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        LinkedList<Long> list = new LinkedList<>();
        long n = new Scanner(System.in).nextLong(), devided = n;


        for(long i = 2; i <= Math.sqrt(n); i++) {
            while(devided % i == 0) {
                devided /= i;
                list.add(i);
            }
        }
        if(devided != 1) list.add(devided);

        System.out.print(n + ":");
        for(long each : list) {
            System.out.print(" " + each);
        }
        System.out.println();
    }
}