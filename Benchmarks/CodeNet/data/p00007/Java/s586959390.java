import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double base = 100;
        double now = base;
        for(int i=0; i<n; i++){
            now = now*0.05+now;
            now=Math.ceil(now);
        }
        System.out.println((int)now*1000);
    }
}
