import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        int maxSum = 0;

        int availK = K;
        if(availK - A >= 0){
            availK -= A;
            maxSum += A;
        }
        else if(availK > 0){
            maxSum += availK;
            availK = 0;
        }
        if(availK - B >= 0){
            availK -= B;
        }
        else if(availK > 0){
            availK = 0;
        }
        if(availK - C >= 0){
            availK -= C;
            maxSum -= C;
        }
        else if(availK > 0){
            maxSum -= availK;
            availK = 0;
        }
        System.out.println(maxSum);
    }
}