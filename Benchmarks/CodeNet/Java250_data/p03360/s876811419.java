import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x[] = new int [3];
        for(int i = 0;i < 3;i++){
            x[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int max = 0;
        int n = 0;
        for(int i = 0;i < 3;i++){
            if(max < x[i]){
                max = x[i];
                n = i;
            }
        }
        for(int i = 0;i < k;i++){
            x[n] *= 2;
        }
        int sum = 0;
        for(int i = 0;i < 3;i++){
            sum += x[i];
        }

        System.out.println(sum);
    }
}