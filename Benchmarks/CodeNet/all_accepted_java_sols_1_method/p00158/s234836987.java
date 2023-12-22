import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            int n=sc.nextInt();
            if(n==0) {
                break;
            }
            int count=0;
            while(n!=1) {
                n=n%2==0?n/2:n*3+1;
                count++;
            }
            System.out.println(count);
        }
    }
}
