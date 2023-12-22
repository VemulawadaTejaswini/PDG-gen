import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in =new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        long sum = 0;
        sum=1;
        sum*=N;
        sum*=(N-1);
        sum/=2;
        int sumM =1;
        sumM*=(M-1);
        sumM*=M;
        sumM/=2;
        System.out.println(sum+sumM);
    }
}
