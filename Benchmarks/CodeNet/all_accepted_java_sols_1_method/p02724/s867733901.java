import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long happiness = 0;
        while (x > 4){
            if(x >= 500){
                long s = x/500;
                happiness += s*1000;
                x=x%500;
            }else if(x >= 5){
                long s = x/5;
                happiness += 5*s;
                x=x%5;
            }
        }
        System.out.println(happiness);
    }
}
