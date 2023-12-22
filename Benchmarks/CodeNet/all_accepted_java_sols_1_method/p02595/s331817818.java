import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long d = sc.nextLong();
        long x = 0;
        long y = 0;

        long count = 0;

        for(long i = 0; i < n; i++){
            x = sc.nextLong();
            y = sc.nextLong();
            if((x * x) + (y * y) <= d * d){
                count++;
            }
        }
        sc.close();

        System.out.println(count);
    }
}