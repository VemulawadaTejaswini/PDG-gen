import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	for(int i = 0 ; i < n ; i++){
    		int a[] = new int[3];
    		for(int j = 0 ; j < 3 ; j++){
    			a[j] = input.nextInt();
    		}
    		Arrays.sort(a);
    		if(Math.pow(a[0],2)+Math.pow(a[1],2) == Math.pow(a[2],2)){
    			System.out.println("YES");
    		}else{
    			System.out.println("NO");
    		}
    	}
    }
}