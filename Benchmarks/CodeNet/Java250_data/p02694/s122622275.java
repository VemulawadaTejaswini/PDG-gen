import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n=in.nextLong();
        int num=0;
        for(long i=100;i<n;){
            i+=i/100;
            num++;

            if(i>=n){
                System.out.println(num);
                return;
            }

        }
    }
}
