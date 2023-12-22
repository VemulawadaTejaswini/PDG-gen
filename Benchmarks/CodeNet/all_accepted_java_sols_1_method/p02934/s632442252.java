import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[a];
        double sum = 0;
        double ans = 0;
        for(int i = 0; i < a; i++){
            array[i] = sc.nextInt();
            sum = sum + (double)1 / array[i];
        }
        ans = 1 / sum;
        System.out.println(ans);
    }
}