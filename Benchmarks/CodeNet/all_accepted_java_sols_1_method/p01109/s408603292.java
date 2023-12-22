import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	int n = sc.nextInt();
        	if(n == 0) break;
        	int[] a = new int[n];
        	int sum = 0;
        	for(int i=0;i<n;i++) {
        		a[i] = sc.nextInt();
        		sum += a[i];
        	}
        	int ave = sum/n;
        	int cnt = 0;
        	for(int i=0;i<n;i++) {
        		if(a[i] <= ave) cnt++;
        	}
        	System.out.println(cnt);
        }
        
    }
}
