import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 1;

        while (N >= K) {
            N /= K;
            count++;
        }
        System.out.println(count);
    }
}