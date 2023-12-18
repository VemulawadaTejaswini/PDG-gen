import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            if(n == 0)
                break;

            int a = sc.nextInt();
            int b = sc.nextInt();

            int max = (a>b)?a:b;
            int min = (a>b)?b:a;
            int sum = 0;

            for(int i=0;i<n-2;i++) {
                int c = sc.nextInt();
                if (c > max) {
                    sum += max;
                    max = c;
                } else if (min > c) {
                    sum += min;
                    min = c;
                } else {
                    sum += c;
                }
            }

            System.out.println(sum/(n-2));
        }
    }
}

