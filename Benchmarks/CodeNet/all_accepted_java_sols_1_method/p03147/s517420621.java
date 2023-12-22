import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        int sum = 0;
        for(int i= 0; i < n; i++) {
        	h[i] = scan.nextInt();
        	sum += h[i];
        }
        int ans = 0;
        while(true) {
        	int temp = ans;
        	boolean f = false;
        	for(int i = 0; i < n; i++) {
        		if(f == false && h[i] != 0) {
        			f = true;
        			ans ++;
        		}
        		if(f) {
        			if(h[i] > 0) {
        				h[i]--;
        				sum--;
        			}else {
        				break;
        			}
        		}
        	}
        	if(temp == ans) {
        		break;
        	}
        }
        System.out.println(ans);
    }
}