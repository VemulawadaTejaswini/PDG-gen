import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long max = -1000001;
        long min = 1000001;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            sum += a;
            if(a > max){
                max = a;
            }
            if(a < min){
                min = a;
            }
        }
        System.out.println(min + " " + max + " " + sum);
    }
}
