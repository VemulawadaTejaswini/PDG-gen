import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mountain = new int[10];

        for(int i=0;i<10;i++){
        	mountain[i] = sc.nextInt();
        }

        Arrays.sort(mountain);
        for(int i=0;i<10;i++){
        	if(i>6){
        		System.out.println(mountain[i]);
        	}
        }
	}
}