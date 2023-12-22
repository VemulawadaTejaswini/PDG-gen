import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[] a =new int[n];
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<k;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);

	// write your code here
    }
}
