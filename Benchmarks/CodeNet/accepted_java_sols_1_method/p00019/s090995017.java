import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 1;
        for(int i = n ; i >= 1 ; i--){
        	sum *= i;
        }
        System.out.println(sum);
    }
}