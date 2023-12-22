import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);
        String param = in.nextLine();
        String[] splitParams = param.split(" ");
        int n = Integer.parseInt(splitParams[0]);
        int k = Integer.parseInt(splitParams[1]);

        double ans = 0;

        for( int i = 1 ; i <= n ; i++ ){
            int point = i;
            int count = 0;
            while( point < k ){
                point *= 2;
                count++;
            }
            ans += 1.0/n*Math.pow(0.5,count);
        }

        System.out.println(ans);

    }
}