import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for(int i = 0; i < n; i++) {
        	l[i] = sc.nextInt();
        }

        Arrays.sort(l);


        long c = 0;
        for(int i = 0; i < n-2; i++) {
        	for(int j = i+1; j < n-1; j++) {
        		int cMax = l[i] + l[j];
        		int cMin = Math.abs(l[i] - l[j]);

        		for(int k = j+1; k < n; k++) {
        			while(k < n && cMin >= l[k]) {
        				k++;
        			}

        			while(k < n && l[k] < cMax) {
        				c++;
        				k++;
        			}
        			break;
        		}
        	}
        }


        System.out.println(c);

    }


}