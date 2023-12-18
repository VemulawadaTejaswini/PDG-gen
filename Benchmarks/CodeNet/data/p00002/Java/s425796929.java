
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

    	Scanner scanner = new Scanner(System.in);
    	Integer[] data = new Integer[200];
    	for (int i = 0; i < 200; i++) {
    		int a = scanner.nextInt();
    		int b = scanner.nextInt();
    		while (!(0 <= a && b <= 1000000)) {
    			a = scanner.nextInt();
    			b = scanner.nextInt();
    		}
    		data[i] =  String.valueOf(a+b).length();
    	}

    	for (int i = 0; i < 200; i++) {
    		System.out.println(data[i]);
    	}

    }
}