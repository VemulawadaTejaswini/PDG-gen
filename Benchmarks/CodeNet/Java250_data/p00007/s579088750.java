import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner scan = new Scanner(System.in);
        double sum = 100000.0;
        int a = scan.nextInt();
        for(int i =1 ;i<=a ;i++){
            sum = sum *0.05+sum;
            sum = (Math.ceil(sum /1000)) *1000;
        }
        System.out.printf("%.0f\n",sum);
    }
}