import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String [] resist = new String[n];
    	for(int i=0;i<n;i++) {
    		resist[i] = sc.next();
    	}
    	int m = sc.nextInt();
    	String [] id = new String[m];	
    	for(int i=0;i<m;i++) {
    		id[i] = sc.next();
    	}
    	Arrays.sort(resist);
    	String [] key = {"Opened","Closed"};
    	int j = 0;
    	for(int i=0;i<m;i++) {
    		int a = Arrays.binarySearch(resist, id[i]);
    		if(a>=0) {
    			System.out.println(key[j%2]+" by "+id[i]);
    			j++;
    		}else {
    			System.out.println("Unknown "+id[i]);
    		}
    	}
    }
}

