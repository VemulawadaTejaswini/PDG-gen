import java.util.Scanner;

public class Sum_of_Consecutive_Integers {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int N;

        while((N = scan.nextInt()) != 0){
            /*int sum = 0;
            for(int i=0;i<N+1;i++){
                sum += i;
            }
            System.out.println(sum);*/

            if(N%2 == 0){
                System.out.println(Even_Number(N));
            } else{
                System.out.println(Odd_Number(N));
            }
        }
    }

    public static int Odd_Number(int number){
        int count = 1;
        for(int i = 3; i*2-1<number; i += 2){
            if(number%i == 0){
                count++;
            }
        }
        return count;
    }

    public  static int Even_Number(int number){
        int count = 0;
        for(int i = 3; i*2-1<number; i++){
            int j = number%i;
            int k = number/i;
            if(j == 0  && number%(k*2) == k){
                count++;
            }
        }
        return count;
    }
}