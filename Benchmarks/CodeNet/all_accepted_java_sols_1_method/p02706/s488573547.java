import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String N = scan.next();
        String M = scan.next();
        int[] a = new int[Integer.parseInt(M)];
        int sum = 0;
        for(int i = 0; i < Integer.parseInt(M);i++){
            sum += Integer.parseInt(scan.next());
        }

        if(Integer.parseInt(N) - sum < 0)System.out.println("-1");
        else System.out.println(Integer.parseInt(N) - sum );

    }
}
