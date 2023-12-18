import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(); int b=sc.nextInt();int[] array = new int[3];
        array[0]=a+b;array[1]=a-b;array[2]=a*b;
        Arrays.sort(array);
        System.out.println(array[2]);
    };
}