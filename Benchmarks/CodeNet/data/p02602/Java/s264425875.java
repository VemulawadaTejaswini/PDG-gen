import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sn = new Scanner(System.in);
    	int n = sn.nextInt();
        int k = sn.nextInt();
      	int a[] = new int[n];
      	for(int i = 0; i < n; i++) {
        	a[i] = sn.nextInt();
        }
      	for(int i = k; i < n; i++){
        	if(a[i] <= a[i - k]) {
            	System.out.println("No");
            } else {
            	System.out.println("Yes");
            }
        }
    }
}