import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int[] a = new int[3];
	for(int i = 0; i < 3; i++){
	    a[i] = scan.nextInt();
	}

	Arrays.sort(a);
	System.out.print(a[2]-a[0]);
    }
}
	
