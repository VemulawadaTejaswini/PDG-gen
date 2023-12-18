import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        int N = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < N; i++) {
           sum += sc.nextLong();
        }
        if(sum < H){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}