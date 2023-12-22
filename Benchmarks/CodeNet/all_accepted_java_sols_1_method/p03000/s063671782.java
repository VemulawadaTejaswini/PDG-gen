import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        int sum=0,cnt;
        for(cnt=0; cnt<N; cnt++) {
            sum += sc.nextInt();
            if(sum > X) break;
        }
        
        System.out.println(cnt+1);
    }
}
