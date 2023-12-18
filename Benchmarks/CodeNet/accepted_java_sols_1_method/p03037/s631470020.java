import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = n;
        int m = sc.nextInt();

        int min = sc.nextInt();
        int max = sc.nextInt();
        for(int i = 1; i < m; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l > min){
                min = l;
            }
            if(r < max){
                max = r;
            }
        }

        result -= (min - 1);
        if(n > max){
            result -= (n - max);
        }
        if(result < 0){
            System.out.println(0);
        }else{
            System.out.println(result);
        }
    }
}
