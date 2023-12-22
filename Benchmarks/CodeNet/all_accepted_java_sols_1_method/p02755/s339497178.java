import java.util.Scanner;
import java.lang.Math;

class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int sum = 0;
        double tax1 = 0.08;
        double tax2 = 0.1;
        while(true){
            sum += 1;
            if(Math.floor(sum*tax1)==a && Math.floor(sum*tax2)==b){
                System.out.println(sum);
                return;
            }
            if(sum>a/tax1 && sum>b/tax2){
                System.out.println("-1");
                return;
            }
        }

    }
}