import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        System.out.printf("%f\n", ((double)L*L*L)/27.0);
    }
}