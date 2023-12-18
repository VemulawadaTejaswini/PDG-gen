import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int sum=0,max=0,min=1000;
            int n = sc.nextInt();
            if(n==0)break;
            for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            sum += a;
            if(a>max)max=a;
            if(a<min)min=a;
            }
            System.out.println((sum-(max+min))/(n-2));
        }
    }
}

