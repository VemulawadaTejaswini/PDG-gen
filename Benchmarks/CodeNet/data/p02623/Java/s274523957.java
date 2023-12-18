import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        int []a = new int[n + m];
        for(int i = 0; i < a.length; i++)
            a[i] = input.nextInt();

        Arrays.sort(a);
        int sum = 0;
        int counter = 0;
        for(int j = 0; j < a.length; j++){
            while (sum < k){
               int total =  sum += a[j];
                if(total < k)
                counter++;
            }
            break;
        }
        System.out.println(counter);
    }
}
