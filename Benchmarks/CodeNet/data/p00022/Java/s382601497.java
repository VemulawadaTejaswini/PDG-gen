import java.util.Scanner;

public class Main {

	private static int[] ar;

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));

    	int n,sum,max;
    	while((n = sc.nextInt()) != 0){
    		max = 0;
    		ar = new int[n];
    		for(int i=0;i<n;i++){ar[i] = sc.nextInt();}
    		for(int i=0;i<n;i++){
    			for(int j=0;j+i+1<n;j++){
    				sum = 0;
    				for(int k=j;k<=j+i+1;k++){sum += ar[k];}
    				if(max < sum){
    					max = sum;
    				}
    			}
    		}
    		System.out.println(max);
    	}
	}
}