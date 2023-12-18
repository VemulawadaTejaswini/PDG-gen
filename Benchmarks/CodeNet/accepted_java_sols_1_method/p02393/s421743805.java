import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] a = new int[3];
    	int i,j,b;

    	for(i=0;i<3;i++){
    		a[i] = sc.nextInt();
    	}

    	for(i=0;i<3;i++){
    		for(j=i;j<3;j++){
        		if(a[i] > a[j]){
        			b = a[i];
        			a[i] = a[j];
        			a[j] = b;
        		}
        	}
       	}
    	System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }
}