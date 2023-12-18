import java.util.Scanner;

public class Main {


    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	long sum = 0, max = -1000000, min = 1000000;
    	long a[] = new long[5]; 
    	int n = scan.nextInt();
    	for(int cnt = 0; cnt < n; cnt++){
    		a[cnt] = scan.nextLong();
    		if(a[cnt] < min)
    			min = a[cnt];
    		if(a[cnt] > max)
    			max = a[cnt];
    		sum += a[cnt];
    	}		
        System.out.println(min + " " + max + " " + sum);
        scan.close();
    }

}