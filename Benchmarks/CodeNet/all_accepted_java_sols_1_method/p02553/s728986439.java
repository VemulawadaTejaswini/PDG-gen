import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long d = scanner.nextInt();

        long array[] = new long[4];
        array[0] = a * c;
        array[1] = a * d;
        array[2] = b * c;
        array[3] = b * d;
        Arrays.sort(array);
        
        System.out.println(array[3]);
    }
}