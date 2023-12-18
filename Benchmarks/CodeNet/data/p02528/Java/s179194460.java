import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int num = input.nextInt();
    	int[] a = new int[num];
    	for(int i = 0 ; i < num ; i++){
    		a[i] = input.nextInt();
    	}
    	Arrays.sort(a);
    	for(int i = 0 ; i < num ; i++){
    		if(i != num-1){
    			System.out.print(a[i]+" ");
    		}else{
    			System.out.println(a[i]);
    		}
    	}
    }
}