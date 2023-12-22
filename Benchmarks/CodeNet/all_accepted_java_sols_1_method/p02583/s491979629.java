import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int temp = sc.nextInt();
	    int returnnum = 0;
	    if (temp >= 3) {
          	int[] list = new int[temp];
	    	for (int i = 0; i < temp; i++) {
	    		int temp2 = sc.nextInt();
	    		list[i] = temp2;
	    	}
	    	Arrays.sort(list);
	    	for (int i = 0; i < temp; i++) {
	    		int wk = list[i];
	    		for (int k = i+1; k < temp; k++) {
	    			int wk2 = list[k];
	    			if (wk == wk2) continue;
		    		for (int j = k+1; j < temp; j++) {
		    			int wk3 = list[j];
		    			if (wk2 == wk3) continue;
		    			if ((wk + wk2) > wk3) {
		    				returnnum++;
		    			}
		    		}
	    		}
	    	}
	    }
	    System.out.println(returnnum);
	}
}
