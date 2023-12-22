import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	int i, k;
    	int a[];
    	a = new int[10];
    	a[0] = in.nextInt();
    	for(i = 1;i < 10;i++){
    		a[i] = in.nextInt();
    		if(a[0] < a[i]){
    			k = a[i];
    			a[i] = a[0];
    			a[0] = k;
    		}
    	}
    	System.out.println(a[0]);
    	for(i = 1;i < 10;i++){
    		if(a[1] < a[i]){
    			k = a[i];
    			a[i] = a[1];
    			a[1] = k;
    		}
    	}
    	System.out.println(a[1]);
    	for(i = 2;i < 10;i++){
    		if(a[2] < a[i]){
    			k = a[i];
    			a[i] = a[2];
    			a[2] = k;
    		}
    	}
    	System.out.println(a[2]);
    }
}