import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 1; i <= N; i++){
            a[sc.nextInt() - 1] = i;
        }
        Arrays.stream(a).forEach(i -> System.out.print(i + " "));

    }

}
