import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		int n = sc.nextInt();
    		int q = sc.nextInt();
    		if(n==0 && q==0) break;
    		int [] date = new int[101];
    		for(int i=0;i<101;i++) {
    			date[i] = 0;
    		}
        	for(int i=0;i<n;i++) {
        		int m = sc.nextInt();
        		for(int j=0;j<m;j++) {
        			int a = sc.nextInt();
        			date[a] += 1;
        		}
        	}
        	int max = 0;
        	int day = 0;
        	for(int i=1;i<101;i++) {
        		if(date[i]>max) {
        			day = i;
        			max = date[i];
        		}
        	}
        	if(max>=q) {
        		System.out.println(day);
        	}else {
        		System.out.println("0");
        	}
    	}
    }
}

