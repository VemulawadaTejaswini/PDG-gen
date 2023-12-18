import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
long N500=N-N%500;
long N5=N-N500-N%5;

long p=N500*2+N5;
System.out.println(p);


    }

}

