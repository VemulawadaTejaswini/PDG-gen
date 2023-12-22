import java.util.Scanner;

public class Main {

	private static int[] ar;

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));

    	int n,sum,max;
    	while((n = sc.nextInt()) != 0){
    		max = Integer.MIN_VALUE;;
    		ar = new int[n];
    		for(int i=0;i<n;i++){ar[i] = sc.nextInt();}
    		for(int i=0;i<n;i++){
   				sum = 0;
   				for(int j=i;j<n;j++){
   					sum += ar[j];
   	   				if(max < sum){max = sum;}
   				}
    		}
    		System.out.println(max);
    	}
	}
}