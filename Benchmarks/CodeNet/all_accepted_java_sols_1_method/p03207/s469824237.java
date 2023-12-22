import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int n = in.nextInt();
            int sum = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                int p = in.nextInt();
                if(p > max){
                    max = p;
                }
                sum += p;
            }
            sum -= max / 2;
            System.out.println(sum);
        }
    }
}