import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
       	for (int a = 0; a < n; a++) {
        	for (int b = 0; b < n; b++) {
            	for (int c = 0; c < n; c++) {
                	if (a * b + c == n) {
                      ans++;
                }
            }
        }
      	System.out.println(ans);
          
        in.close();
    }
}