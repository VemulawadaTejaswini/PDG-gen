import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        long sum = 0;
        for(int i = 1; i<=a; i++){
            if(i % 3 != 0 && i % 5 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}