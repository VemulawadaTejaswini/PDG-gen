import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt(),t=sc.nextInt();
        int sum=0;
        while(n>0){
            n = n-x;
            sum = sum + t;
        }
        System.out.println(sum);
    }
}