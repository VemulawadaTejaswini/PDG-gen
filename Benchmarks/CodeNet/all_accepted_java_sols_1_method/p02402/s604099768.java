import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long min = 1000000, max = -1000000, sum = 0;
        for(int i = 0; i < n; i++){
            long buf = sc.nextInt();
            if(buf < min) min = buf;
            if(buf > max) max = buf;
            sum += buf;
        }
        System.out.println(String.format("%d %d %d", min, max, sum));
    }
}

