import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int left=0, right=2147483647;

        int l, r;
        for (int i=0; i<M; i++){
            l = sc.nextInt();
            r = sc.nextInt();
            if (l > left){
                left = l;
            }
            if (r < right){
                right = r;
            }
        }
        sc.close();

        int result=0;
        if(left <= right){
            result = right - left + 1;
        }
            
        System .out.println(result);

    }

}