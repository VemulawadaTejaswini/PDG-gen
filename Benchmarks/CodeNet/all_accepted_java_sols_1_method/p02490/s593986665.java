import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(true){
    		int[] a = new int[2];
    		a[0] = input.nextInt();
    		a[1] = input.nextInt(); 
    		if(a[0] == 0 && a[1] == 0)break;
    		Arrays.sort(a);
    		System.out.println(a[0]+" "+a[1]);
    	}
    }
}