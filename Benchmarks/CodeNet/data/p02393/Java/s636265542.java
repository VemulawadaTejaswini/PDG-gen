import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int []data = new int[3];
        data[0] = sc.nextInt();
        data[1] = sc.nextInt();
        data[2] = sc.nextInt();

        Arrays.sort(data);
        System.out.println(data[0]+" "+data[1]+" "+data[2]);
        }
}