import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();

        long value = 100;
        long elapsedYear = 0L;

        while(value < x){  
            value = value + value / 100;
            elapsedYear++;
        }
        System.out.println(elapsedYear);
    }
}