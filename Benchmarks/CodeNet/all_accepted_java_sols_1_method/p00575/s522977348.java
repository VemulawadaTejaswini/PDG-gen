import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        long C = sc.nextLong();
        long sum = 0;
        int counter = 0;
        while(sum < C){
            sum += A;
            if(counter % 7 == 6) sum += B;
            counter++;
        }
        System.out.println(counter);
    }
}

