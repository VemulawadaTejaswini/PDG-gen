import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int sum = sc.nextInt();

        int count = 0;

        for(int i=0;i<=sum;i++){
            for(int j=0;j<=sum;j++){
                int value = r*i + g*j;

                if(value<=sum && (sum-value)%b==0)
                    count++;
            }
        }

        System.out.println(count);

    }
}