import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i=0;i<n;i++) {
			p[i]= sc.nextInt();
		}
		int ans = 0;
		for(int i=1;i<n-1;i++) {
			if((p[i-1]-p[i])*(p[i]-p[i+1])>0){
				ans ++;
			}
		}
		System.out.println(ans);
	}
}