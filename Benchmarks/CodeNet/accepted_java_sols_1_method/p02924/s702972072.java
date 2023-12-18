import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int num = scan.nextInt();
        
        long sum = 0;
        for(int i = 1; i < num; i++){
            sum += i;
        }

        System.out.println(sum);

    }
}