import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int t=sc.nextInt();
        int rem=n%x;
        if (rem==0){
            int div=n/x;
            System.out.println(div*t);
        }
        else{
            int div=(n/x)+1;
            System.out.println(div*t);
        }
    }
}
