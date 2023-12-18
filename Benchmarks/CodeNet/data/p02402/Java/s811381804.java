import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = sc.nextInt();
        int min = (int)sum,max = (int)sum;
        for(int i = 1;i < n;++i){
            int a = sc.nextInt();
            if(max < a) max = a;
            else if(a < min) min = a;
            sum += a;
        }
        System.out.printf("%d %d %d\n",min,max,sum);
    }

}