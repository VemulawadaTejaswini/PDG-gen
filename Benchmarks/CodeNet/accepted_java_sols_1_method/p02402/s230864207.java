import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	long[] values = new long[n];

        for(int i = 0; i < n; i++){
        	values[i] = scan.nextInt();
        }

        long min = values[0];
        long max = values[0];
        long sum = 0;

        for(int i = 0; i < values.length; i++){
        	if(min > values[i]){
        		min = values[i];
        	}
        	if(max < values[i]){
        		max = values[i];
        	}
        	sum += values[i];
        }
        System.out.printf("%d %d %d\n", min,max,sum);
    }
}