import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int min = 200000000,max = -200000000;
    	long sum=0;
    	int n = sc.nextInt();
    	int a[]= new int[n+1];
    	for(int i=0;i<n;i++) {
    		a[i]=sc.nextInt();
    		min = Math.min(min, a[i]);
    		max = Math.max(max, a[i]);
    		sum += a[i];
    	}
    	System.out.printf("%d %d %d\n",min,max,sum);
    	
    }
}
