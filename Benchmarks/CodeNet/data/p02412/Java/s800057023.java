import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        while(input.hasNext()){
            n = input.nextInt();
            sum = input.nextInt();
            if(n == 0 && sum == 0)
                break;
            calculate(n, sum);
        }
    }
    
    public static void calculate(int n, int s){
        int cnt = 0;
        for (int i = 1; i < n; i ++)
            for (int j = i + 1; j < n; j ++)
                for (int k = j + 1; k <= n; k ++)
                    if ((i + j + k) == s)
                        cnt ++;
        System.out.println(cnt);
    }
}
